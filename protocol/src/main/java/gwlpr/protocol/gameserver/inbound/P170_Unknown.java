
package gwlpr.protocol.gameserver.inbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P170_Unknown
    extends GWMessage
{

    private int unknown1;
    private short unknown2;
    private int unknown3;
    private short unknown4;
    private short unknown5;

    @Override
    public short getHeader() {
        return  170;
    }

    public int getUnknown1() {
        return unknown1;
    }

    public short getUnknown2() {
        return unknown2;
    }

    public int getUnknown3() {
        return unknown3;
    }

    public short getUnknown4() {
        return unknown4;
    }

    public short getUnknown5() {
        return unknown5;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P170_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(this.unknown3).append(",unknown4=").append(this.unknown4).append(",unknown5=").append(this.unknown5).append("]");
        return sb.toString();
    }

}
