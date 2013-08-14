
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P401_Unknown
    extends GWMessage
{

    private short unknown1;
    private String unknown2;
    private String unknown3;
    private short unknown4;
    private long unknown5;
    private long unknown6;
    private long unknown7;
    private long unknown8;

    @Override
    public short getHeader() {
        return  401;
    }

    public void setUnknown1(short unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(String unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(String unknown3) {
        this.unknown3 = unknown3;
    }

    public void setUnknown4(short unknown4) {
        this.unknown4 = unknown4;
    }

    public void setUnknown5(long unknown5) {
        this.unknown5 = unknown5;
    }

    public void setUnknown6(long unknown6) {
        this.unknown6 = unknown6;
    }

    public void setUnknown7(long unknown7) {
        this.unknown7 = unknown7;
    }

    public void setUnknown8(long unknown8) {
        this.unknown8 = unknown8;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P401_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2 .toString()).append(",unknown3=").append(this.unknown3 .toString()).append(",unknown4=").append(this.unknown4).append(",unknown5=").append(this.unknown5).append(",unknown6=").append(this.unknown6).append(",unknown7=").append(this.unknown7).append(",unknown8=").append(this.unknown8).append("]");
        return sb.toString();
    }

}