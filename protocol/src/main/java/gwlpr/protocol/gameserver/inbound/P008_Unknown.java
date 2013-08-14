
package gwlpr.protocol.gameserver.inbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.IsArray;
import gwlpr.protocol.util.NestedMarker;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P008_Unknown
    extends GWMessage
{

    private long agentID1;
    @IsArray(constant = false, size = 16, prefixLength = 2)
    private P008_Unknown.NestedUnknown2 [] unknown2;
    @IsArray(constant = false, size = 16, prefixLength = 2)
    private P008_Unknown.NestedUnknown3 [] unknown3;

    @Override
    public short getHeader() {
        return  8;
    }

    public long getAgentID1() {
        return agentID1;
    }

    public P008_Unknown.NestedUnknown2 [] getUnknown2() {
        return unknown2;
    }

    public P008_Unknown.NestedUnknown3 [] getUnknown3() {
        return unknown3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P008_Unknown[");
        sb.append("agentID1=").append(this.agentID1).append(",unknown2=").append(Arrays.toString(this.unknown2)).append(",unknown3=").append(Arrays.toString(this.unknown3)).append("]");
        return sb.toString();
    }

    public final static class NestedUnknown2
        implements NestedMarker
    {

        private long unknown1;

        public long getUnknown1() {
            return unknown1;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("NestedUnknown2[");
            sb.append("unknown1=").append(this.unknown1).append("]");
            return sb.toString();
        }

    }

    public final static class NestedUnknown3
        implements NestedMarker
    {

        private long unknown1;

        public long getUnknown1() {
            return unknown1;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("NestedUnknown3[");
            sb.append("unknown1=").append(this.unknown1).append("]");
            return sb.toString();
        }

    }

}
