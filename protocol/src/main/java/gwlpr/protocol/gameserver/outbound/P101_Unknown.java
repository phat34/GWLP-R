
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P101_Unknown
    extends GWMessage
{

    private long agentID1;

    @Override
    public short getHeader() {
        return  101;
    }

    public void setAgentID1(long agentID1) {
        this.agentID1 = agentID1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P101_Unknown[");
        sb.append("agentID1=").append(this.agentID1).append("]");
        return sb.toString();
    }

}
