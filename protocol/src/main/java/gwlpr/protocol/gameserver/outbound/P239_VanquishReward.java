
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P239_VanquishReward
    extends GWMessage
{

    private int mapID;
    private long experienceEarned;
    private long goldEarned;

    @Override
    public short getHeader() {
        return  239;
    }

    public void setMapID(int mapID) {
        this.mapID = mapID;
    }

    public void setExperienceEarned(long experienceEarned) {
        this.experienceEarned = experienceEarned;
    }

    public void setGoldEarned(long goldEarned) {
        this.goldEarned = goldEarned;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P239_VanquishReward[");
        sb.append("mapID=").append(this.mapID).append(",experienceEarned=").append(this.experienceEarned).append(",goldEarned=").append(this.goldEarned).append("]");
        return sb.toString();
    }

}