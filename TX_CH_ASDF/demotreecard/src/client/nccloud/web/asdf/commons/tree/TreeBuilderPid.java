
package nccloud.web.asdf.commons.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeBuilderPid implements TreeBuilder{
    RootNode rootNode = new RootNode();

    class RootNode extends TreeNode{
        public RootNode() {
            super(null, null, null, null);
        }
    }

    Map<String, ITreeNode> nodeMap = new HashMap<String, ITreeNode>();

    public List<ITreeNode> buildTree(List<ITreeNode> treenodes) {
        for(int i = 0; i < treenodes.size(); i++){
            ITreeNode node = treenodes.get(i);
            nodeMap.put(node.getId(), node);
        }

        for(int i = 0; i < treenodes.size(); i++){
            ITreeNode node = treenodes.get(i);
            ITreeNode pnode = nodeMap.get(node.getPid());
            if(pnode != null){
                pnode.getChildren().size();
                pnode.getChildren().add(node);
        } else
            rootNode.getChildren().add(node);
        }
        List list = new ArrayList<ITreeNode>();

            list.addAll(rootNode.getChildren());

            //          TreeNode tn = (TreeNode)rootNode.getChildren().toArray()[0];
            //          TreeNode tn2 = (TreeNode)tn.getChildren().toArray()[0];
            //          TreeNode[] tn3= (TreeNode[])tn.getChildren().toArray();
            return list;
            }


            }
