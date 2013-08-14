
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P102_HeroCreate
    extends GWMessage
{

    private int heroID;
    private long agentID;
    private long itemStreamID;
    private long mode;

    @Override
    public short getHeader() {
        return  102;
    }

    public void setHeroID(int heroID) {
        this.heroID = heroID;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

    public void setItemStreamID(long itemStreamID) {
        this.itemStreamID = itemStreamID;
    }

    public void setMode(long mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P102_HeroCreate[");
        sb.append("heroID=").append(this.heroID).append(",agentID=").append(this.agentID).append(",itemStreamID=").append(this.itemStreamID).append(",mode=").append(this.mode).append("]");
        return sb.toString();
    }

}
