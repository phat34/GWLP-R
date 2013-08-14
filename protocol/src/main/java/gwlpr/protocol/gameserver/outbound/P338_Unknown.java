
package gwlpr.protocol.gameserver.outbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.IsArray;
import gwlpr.protocol.util.NestedMarker;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P338_Unknown
    extends GWMessage
{

    private int unknown1;
    @IsArray(constant = false, size = 7, prefixLength = 2)
    private P338_Unknown.NestedUnknown2 [] unknown2;

    @Override
    public short getHeader() {
        return  338;
    }

    public void setUnknown1(int unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(P338_Unknown.NestedUnknown2 [] unknown2) {
        this.unknown2 = unknown2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P338_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(Arrays.toString(this.unknown2)).append("]");
        return sb.toString();
    }

    public final static class NestedUnknown2
        implements NestedMarker
    {

        private short unknown1;
        private int unknown2;
        private short unknown3;
        private int unknown4;
        private int unknown5;
        private int unknown6;
        private int unknown7;

        public void setUnknown1(short unknown1) {
            this.unknown1 = unknown1;
        }

        public void setUnknown2(int unknown2) {
            this.unknown2 = unknown2;
        }

        public void setUnknown3(short unknown3) {
            this.unknown3 = unknown3;
        }

        public void setUnknown4(int unknown4) {
            this.unknown4 = unknown4;
        }

        public void setUnknown5(int unknown5) {
            this.unknown5 = unknown5;
        }

        public void setUnknown6(int unknown6) {
            this.unknown6 = unknown6;
        }

        public void setUnknown7(int unknown7) {
            this.unknown7 = unknown7;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("NestedUnknown2[");
            sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(this.unknown3).append(",unknown4=").append(this.unknown4).append(",unknown5=").append(this.unknown5).append(",unknown6=").append(this.unknown6).append(",unknown7=").append(this.unknown7).append("]");
            return sb.toString();
        }

    }

}
