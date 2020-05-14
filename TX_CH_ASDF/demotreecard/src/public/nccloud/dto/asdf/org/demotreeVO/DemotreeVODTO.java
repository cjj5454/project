
package nccloud.dto.asdf.org.demotreeVO;

import nc.vo.pub.lang.UFDateTime;

public class DemotreeVODTO {
    private String pk_depa;
    private UFDateTime ts;

    public String getPk_depa() {
        return pk_depa;
    }

    public void setPk_depa(String pk_depa) {
        this.pk_depa = pk_depa;
    }

    public UFDateTime getTs() {
        return ts;
    }

    public void setTs(UFDateTime ts) {
        this.ts = ts;
    }
}
