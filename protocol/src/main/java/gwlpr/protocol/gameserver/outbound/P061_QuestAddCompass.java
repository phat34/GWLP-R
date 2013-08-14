
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.Vector2;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P061_QuestAddCompass
    extends GWMessage
{

    private long iD;
    private Vector2 position;
    private int unknown1;
    private int unknown2;
    private long unknown3;
    private String category;
    private String name;
    private String givenBy;
    private int mapID;

    @Override
    public short getHeader() {
        return  61;
    }

    public void setID(long iD) {
        this.iD = iD;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public void setUnknown1(int unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(int unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(long unknown3) {
        this.unknown3 = unknown3;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGivenBy(String givenBy) {
        this.givenBy = givenBy;
    }

    public void setMapID(int mapID) {
        this.mapID = mapID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P061_QuestAddCompass[");
        sb.append("iD=").append(this.iD).append(",position=").append(this.position.toString()).append(",unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(this.unknown3).append(",category=").append(this.category.toString()).append(",name=").append(this.name.toString()).append(",givenBy=").append(this.givenBy.toString()).append(",mapID=").append(this.mapID).append("]");
        return sb.toString();
    }

}
