
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P050_AgentAllyDestroy
    extends GWMessage
{

    private long agent;

    @Override
    public short getHeader() {
        return  50;
    }

    public void setAgent(long agent) {
        this.agent = agent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P050_AgentAllyDestroy[");
        sb.append("agent=").append(this.agent).append("]");
        return sb.toString();
    }

}
