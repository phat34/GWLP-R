
package gwlpr.protocol.gameserver.outbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.IsArray;
import gwlpr.protocol.util.NestedMarker;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P126_Unknown
    extends GWMessage
{

    @IsArray(constant = false, size = 64, prefixLength = 2)
    private P126_Unknown.NestedUnknown1 [] unknown1;

    @Override
    public short getHeader() {
        return  126;
    }

    public void setUnknown1(P126_Unknown.NestedUnknown1 [] unknown1) {
        this.unknown1 = unknown1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P126_Unknown[");
        sb.append("unknown1=").append(Arrays.toString(this.unknown1)).append("]");
        return sb.toString();
    }

    public final static class NestedUnknown1
        implements NestedMarker
    {

        private long unknown1;

        public void setUnknown1(long unknown1) {
            this.unknown1 = unknown1;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("NestedUnknown1[");
            sb.append("unknown1=").append(this.unknown1).append("]");
            return sb.toString();
        }

    }

}
