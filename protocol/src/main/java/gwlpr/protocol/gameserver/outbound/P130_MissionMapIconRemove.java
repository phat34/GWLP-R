
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P130_MissionMapIconRemove
    extends GWMessage
{

    private long localID;

    @Override
    public short getHeader() {
        return  130;
    }

    public void setLocalID(long localID) {
        this.localID = localID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P130_MissionMapIconRemove[");
        sb.append("localID=").append(this.localID).append("]");
        return sb.toString();
    }

}
