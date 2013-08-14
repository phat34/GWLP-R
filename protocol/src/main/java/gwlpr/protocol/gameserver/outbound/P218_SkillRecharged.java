
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P218_SkillRecharged
    extends GWMessage
{

    private long agentID;
    private int skillID;
    private long skillInstance;

    @Override
    public short getHeader() {
        return  218;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }

    public void setSkillInstance(long skillInstance) {
        this.skillInstance = skillInstance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P218_SkillRecharged[");
        sb.append("agentID=").append(this.agentID).append(",skillID=").append(this.skillID).append(",skillInstance=").append(this.skillInstance).append("]");
        return sb.toString();
    }

}
