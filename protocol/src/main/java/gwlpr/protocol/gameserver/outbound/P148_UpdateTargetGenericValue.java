
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P148_UpdateTargetGenericValue
    extends GWMessage
{

    private long valueID;
    private long target;
    private long caster;
    private long value;

    @Override
    public short getHeader() {
        return  148;
    }

    public void setValueID(long valueID) {
        this.valueID = valueID;
    }

    public void setTarget(long target) {
        this.target = target;
    }

    public void setCaster(long caster) {
        this.caster = caster;
    }

    public void setValue(long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P148_UpdateTargetGenericValue[");
        sb.append("valueID=").append(this.valueID).append(",target=").append(this.target).append(",caster=").append(this.caster).append(",value=").append(this.value).append("]");
        return sb.toString();
    }

}
