
package nccloud.web.asdf.commons.tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
@SuppressWarnings("unused")
public class TreeNode implements ITreeNode{
    private String key;
    private String title;

    private String refname;
    private String refpk ;

    private String id;
    private String name;
    private String pid;
    private String innercode;
    private String code;

    //组织体系结构调整排序（比较特殊，需要另行处理）
    //private boolean isOrgStruSort = false;

    private Map nodeData = new HashMap();

    private Collection<ITreeNode> children = new  TreeSet<ITreeNode>(new DefaultComparatorCode());

        static class DefaultComparatorCode implements Comparator<ITreeNode>{
            @Override
            public int compare(ITreeNode p1, ITreeNode p2) {
            TreeNode t1 = (TreeNode) p1;
            TreeNode t2 = (TreeNode) p2;
            String code1 = (String) t1.getCode();
            String code2 = (String) t2.getCode();
            return code1.compareTo(code2);
            }
            }

            public TreeNode(String id, String name, String pid, String innercode) {
            this(id,name, pid, innercode, "");
            }

            public TreeNode(String id, String name, String pid, String innercode, String code) {
            this(id, name, pid, innercode, "" ,new HashMap(), new DefaultComparatorCode());
            }

            public TreeNode(String id, String name, String pid, String innercode, String code, Map nodeData, Comparator<ITreeNode> comparator) {
                super();
                setId(id);
                setName(name);
                setPid(pid);
                setInnercode(innercode);
                setNodeData(nodeData);
                setCode(code == null ? "" : code);
                if(comparator != null){
                this.children = new  TreeSet<ITreeNode>(comparator);
                    }
                    }



                    //  public TreeNode(String id, String name, String pid, String innercode, String code,boolean isOrgStruSort) {
                    //          super();
                    //          setId(id);
                    //          setName(name);
                    //          setPid(pid);
                    //          setInnercode(innercode);
                    //          setCode(code == null ? "" : code);
                    //          this.isOrgStruSort = isOrgStruSort;
                    //  }

                    public String getId() {
                    return id;
                    }

                    public void setId(String id) {
                    this.id = id;
                    this.refpk = id;
                    this.key = id;
                    }

                    public String getName() {
                    return name;
                    }

                    public void setName(String name) {
                    this.name = name;
                    this.title = name;
                    this.refname = name;
                    }

                    public String getPid() {
                    return pid;
                    }

                    public void setPid(String pid) {
                    this.pid = pid;
                    }

                    public String getInnercode() {
                    return innercode;
                    }

                    public void setInnercode(String innercode) {
                    this.innercode = innercode;
                    }

                    public Map getNodeData() {
                    return nodeData;
                    }

                    public void setNodeData(Map nodeData) {
                    this.nodeData = nodeData;
                    }

                    public Collection<ITreeNode> getChildren() {
                        return children;
                        }

                        public void setChildren(Collection<ITreeNode> children) {
                            this.children.addAll(children);
                            }

                            public String getKey() {
                            return getId();
                            }

                            public void setKey(String key) {
                            setId(key);
                            }

                            public String getTitle() {
                            return getName();
                            }

                            public void setTitle(String title) {
                            setName(title);
                            }

                            public String getRefname() {
                            return getName();
                            }

                            public void setRefname(String refname) {
                            setName(refname);
                            }

                            public String getRefpk() {
                            return getId();
                            }

                            public void setRefpk(String refpk) {
                            setId(refpk);
                            }

                            @Override
                            public void setCode(String code) {
                            this.code = code;
                            }

                            @Override
                            public String getCode() {
                            return code;
                            }

                            }
