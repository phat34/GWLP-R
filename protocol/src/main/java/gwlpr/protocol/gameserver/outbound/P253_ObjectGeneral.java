
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * This is used to setup objects such as signposts.
 * 
 */
public final class P253_ObjectGeneral
    extends GWMessage
{

    private long localID;
    private long modelFile;
    private long flag;
    private short scale;
    private String name;

    @Override
    public short getHeader() {
        return  253;
    }

    public void setLocalID(long localID) {
        this.localID = localID;
    }

    public void setModelFile(long modelFile) {
        this.modelFile = modelFile;
    }

    public void setFlag(long flag) {
        this.flag = flag;
    }

    public void setScale(short scale) {
        this.scale = scale;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P253_ObjectGeneral[");
        sb.append("localID=").append(this.localID).append(",modelFile=").append(this.modelFile).append(",flag=").append(this.flag).append(",scale=").append(this.scale).append(",name=").append(this.name.toString()).append("]");
        return sb.toString();
    }

}
