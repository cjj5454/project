
package nccloud.web.asdf.commons.tree;

import java.util.Collection;

public interface ITreeNode {
    public String getId();
    public void setId(String id);
    public String getName();
    public void setName(String name);
    public String getPid();
    public void setPid(String pid);
    public String getInnercode();
    public void setInnercode(String innercode);

    public void setCode(String code);
    public String getCode();

    public Collection<ITreeNode> getChildren();
    public void setChildren(Collection<ITreeNode> children);
        }
