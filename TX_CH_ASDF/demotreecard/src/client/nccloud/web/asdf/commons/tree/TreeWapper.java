
package nccloud.web.asdf.commons.tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nccloud.commons.lang.ArrayUtils;

public abstract class TreeWapper< T extends Object> {

protected T[] objs;
TreeBuilder builder;
Comparator comparator;
public TreeWapper(T[] objs){
this(objs, new TreeBuilderPid());
}

public TreeWapper(T[] objs, TreeBuilder builder) {
this(objs, builder, null);
}

public TreeWapper(T[] objs, TreeBuilder builder, Comparator comparator) {
super();
this.objs = objs;
this.builder = builder;
this.comparator = comparator;
}


protected abstract String getId(T t);
protected abstract String getName(T t);
protected abstract String getPid(T t);
protected abstract String getInnercode(T t);

public String getCode(T t){
return getName(t);
}

public Comparator nodeComparator(){
return comparator;
}

protected Map getData(T t) {
return new HashMap();
}

public List<ITreeNode> getTree(){
    List<ITreeNode> nodes = new ArrayList<ITreeNode>();
            if(objs == null || objs.length == 0){
            return nodes;
            }
            for(int i = 0; i < objs.length; i++){
            T t = objs[i];
            TreeNode node = new TreeNode(getId(t), getName(t), getPid(t), getInnercode(t), getCode(t), null, nodeComparator());
            node.setNodeData(getData(t));
            nodes.add(node);
            }
            List<ITreeNode> newNodes =  builder.buildTree(nodes);
                if(nodeComparator() != null){
                java.util.Collections.sort(newNodes, nodeComparator());
                }
                return newNodes;
                }

                /**
                * 组织体系结构调整专用
                * @param children 二叉树的排序方案
                * @return
                */
                public List<ITreeNode> getTree(boolean isOrgStruMember){
                    if(isOrgStruMember){
                    builder = new TreeBuilderPid();
                    comparator = new OrgStruMemberTreeComparator();
                    }
                    return getTree();
                    }
                    /**
                    * 组织体系结构调整专用
                    * @param children 二叉树的排序方案
                    * @return
                    */
                    class OrgStruMemberTreeComparator implements Comparator<ITreeNode>{
                        @Override
                        public int compare(ITreeNode p1, ITreeNode p2) {
                        TreeNode t1 = (TreeNode) p1;
                        TreeNode t2 = (TreeNode) p2;
                        String code1 = (String) t1.getCode();
                        String code2 = (String) t2.getCode();
                        if(code1 == null || code2 == null){
                        return 0;
                        }
                        Integer i1 = Integer.parseInt(code1);
                        Integer i2 = Integer.parseInt(code2);
                        int compareTo = i1.compareTo(i2);
                        if(compareTo == 0){//若是为0会导致树节点丢失，若是顺序相同，则保持加入的顺序
                        compareTo = -1;
                        }
                        return compareTo * -1;
                        }
                        }
                        }
