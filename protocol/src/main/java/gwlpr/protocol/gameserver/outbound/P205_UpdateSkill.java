
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P205_UpdateSkill
    extends GWMessage
{

    private long agentID;
    private short slot;
    private int skillID;
    private long skillInstance;

    @Override
    public short getHeader() {
        return  205;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

    public void setSlot(short slot) {
        this.slot = slot;
    }

    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }

    public void setSkillInstance(long skillInstance) {
        this.skillInstance = skillInstance;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P205_UpdateSkill[");
        sb.append("agentID=").append(this.agentID).append(",slot=").append(this.slot).append(",skillID=").append(this.skillID).append(",skillInstance=").append(this.skillInstance).append("]");
        return sb.toString();
    }

}
