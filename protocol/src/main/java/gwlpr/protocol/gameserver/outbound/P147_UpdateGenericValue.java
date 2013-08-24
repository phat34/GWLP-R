
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P147_UpdateGenericValue
    extends GWMessage
{

    private long valueID;
    private long agentID;
    private long value;

    @Override
    public short getHeader() {
        return  147;
    }

    public void setValueID(long valueID) {
        this.valueID = valueID;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

    public void setValue(long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P147_UpdateGenericValue[");
        sb.append("valueID=").append(this.valueID).append(",agentID=").append(this.agentID).append(",value=").append(this.value).append("]");
        return sb.toString();
    }

}