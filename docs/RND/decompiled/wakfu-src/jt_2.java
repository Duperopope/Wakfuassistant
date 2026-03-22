/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from jT
 */
public final class jt_2
extends GeneratedMessageV3
implements jw_2 {
    private static final long DH = 0L;
    int an;
    public static final int DI = 1;
    long DJ;
    public static final int DK = 2;
    int mj;
    public static final int DL = 3;
    long DM;
    public static final int DN = 5;
    volatile Object bs;
    public static final int DO = 6;
    volatile Object DP;
    public static final int DQ = 7;
    volatile Object DR;
    public static final int DS = 8;
    int DT;
    public static final int DU = 9;
    int DV;
    public static final int DW = 10;
    int DX;
    public static final int DY = 11;
    int DZ;
    public static final int Ea = 12;
    int Eb;
    public static final int Ec = 13;
    List<jx_2> Ed;
    public static final int Ee = 14;
    List<jp_2> Ef;
    public static final int Eg = 15;
    List<jl_2> Eh;
    private byte Y = (byte)-1;
    private static final jt_2 Ei = new jt_2();
    @Deprecated
    public static final Parser<jt_2> Ej = new ju_2();

    jt_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jt_2() {
        this.bs = "";
        this.DP = "";
        this.DR = "";
        this.Ed = Collections.emptyList();
        this.Ef = Collections.emptyList();
        this.Eh = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new jt_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jt_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block24: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block24;
                    }
                    case 8: {
                        this.an |= 1;
                        this.DJ = codedInputStream.readInt64();
                        continue block24;
                    }
                    case 16: {
                        this.an |= 2;
                        this.mj = codedInputStream.readInt32();
                        continue block24;
                    }
                    case 24: {
                        this.an |= 4;
                        this.DM = codedInputStream.readInt64();
                        continue block24;
                    }
                    case 42: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 8;
                        this.bs = byteString;
                        continue block24;
                    }
                    case 50: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 0x10;
                        this.DP = byteString;
                        continue block24;
                    }
                    case 58: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 0x20;
                        this.DR = byteString;
                        continue block24;
                    }
                    case 64: {
                        this.an |= 0x40;
                        this.DT = codedInputStream.readInt32();
                        continue block24;
                    }
                    case 72: {
                        this.an |= 0x80;
                        this.DV = codedInputStream.readInt32();
                        continue block24;
                    }
                    case 80: {
                        this.an |= 0x100;
                        this.DX = codedInputStream.readInt32();
                        continue block24;
                    }
                    case 88: {
                        this.an |= 0x200;
                        this.DZ = codedInputStream.readInt32();
                        continue block24;
                    }
                    case 96: {
                        this.an |= 0x400;
                        this.Eb = codedInputStream.readInt32();
                        continue block24;
                    }
                    case 106: {
                        if ((n & 0x800) == 0) {
                            this.Ed = new ArrayList<jx_2>();
                            n |= 0x800;
                        }
                        this.Ed.add((jx_2)codedInputStream.readMessage(jx_2.Eu, extensionRegistryLite));
                        continue block24;
                    }
                    case 114: {
                        if ((n & 0x1000) == 0) {
                            this.Ef = new ArrayList<jp_2>();
                            n |= 0x1000;
                        }
                        this.Ef.add((jp_2)codedInputStream.readMessage(jp_2.DG, extensionRegistryLite));
                        continue block24;
                    }
                    case 122: {
                        if ((n & 0x2000) == 0) {
                            this.Eh = new ArrayList<jl_2>();
                            n |= 0x2000;
                        }
                        this.Eh.add((jl_2)codedInputStream.readMessage(jl_2.Df, extensionRegistryLite));
                        continue block24;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
                bl = true;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (UninitializedMessageException uninitializedMessageException) {
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 0x800) != 0) {
                this.Ed = Collections.unmodifiableList(this.Ed);
            }
            if ((n & 0x1000) != 0) {
                this.Ef = Collections.unmodifiableList(this.Ef);
            }
            if ((n & 0x2000) != 0) {
                this.Eh = Collections.unmodifiableList(this.Eh);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor XY() {
        return jk_2.CQ;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jk_2.CR.ensureFieldAccessorsInitialized(jt_2.class, jv_2.class);
    }

    @Override
    public boolean XZ() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Ya() {
        return this.DJ;
    }

    @Override
    public boolean tK() {
        return (this.an & 2) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    @Override
    public boolean Yb() {
        return (this.an & 4) != 0;
    }

    @Override
    public long Yc() {
        return this.DM;
    }

    @Override
    public boolean wq() {
        return (this.an & 8) != 0;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.bs = string;
        }
        return string;
    }

    @Override
    public ByteString bW() {
        Object object = this.bs;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bs = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean Yd() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public String getDescription() {
        Object object = this.DP;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.DP = string;
        }
        return string;
    }

    @Override
    public ByteString Ye() {
        Object object = this.DP;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.DP = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean Q() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public String getMessage() {
        Object object = this.DR;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.DR = string;
        }
        return string;
    }

    @Override
    public ByteString Yf() {
        Object object = this.DR;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.DR = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean Yg() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public int Yh() {
        return this.DT;
    }

    @Override
    public boolean Yi() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public int Yj() {
        return this.DV;
    }

    @Override
    public boolean Yk() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public int Yl() {
        return this.DX;
    }

    @Override
    public boolean Ym() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public int Yn() {
        return this.DZ;
    }

    @Override
    public boolean Yo() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public int Yp() {
        return this.Eb;
    }

    @Override
    public List<jx_2> Yq() {
        return this.Ed;
    }

    @Override
    public List<? extends ka_1> Yr() {
        return this.Ed;
    }

    @Override
    public int Ys() {
        return this.Ed.size();
    }

    @Override
    public jx_2 fO(int n) {
        return this.Ed.get(n);
    }

    @Override
    public ka_1 fP(int n) {
        return this.Ed.get(n);
    }

    @Override
    public List<jp_2> Yt() {
        return this.Ef;
    }

    @Override
    public List<? extends js_2> Yu() {
        return this.Ef;
    }

    @Override
    public int Yv() {
        return this.Ef.size();
    }

    @Override
    public jp_2 fQ(int n) {
        return this.Ef.get(n);
    }

    @Override
    public js_2 fR(int n) {
        return this.Ef.get(n);
    }

    @Override
    public List<jl_2> Yw() {
        return this.Eh;
    }

    @Override
    public List<? extends jo_2> Yx() {
        return this.Eh;
    }

    @Override
    public int Yy() {
        return this.Eh.size();
    }

    @Override
    public jl_2 fS(int n) {
        return this.Eh.get(n);
    }

    @Override
    public jo_2 fT(int n) {
        return this.Eh.get(n);
    }

    public final boolean isInitialized() {
        int n;
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.XZ()) {
            this.Y = 0;
            return false;
        }
        if (!this.tK()) {
            this.Y = 0;
            return false;
        }
        if (!this.Yb()) {
            this.Y = 0;
            return false;
        }
        if (!this.wq()) {
            this.Y = 0;
            return false;
        }
        if (!this.Yd()) {
            this.Y = 0;
            return false;
        }
        if (!this.Q()) {
            this.Y = 0;
            return false;
        }
        if (!this.Yg()) {
            this.Y = 0;
            return false;
        }
        if (!this.Yi()) {
            this.Y = 0;
            return false;
        }
        if (!this.Yk()) {
            this.Y = 0;
            return false;
        }
        if (!this.Ym()) {
            this.Y = 0;
            return false;
        }
        if (!this.Yo()) {
            this.Y = 0;
            return false;
        }
        for (n = 0; n < this.Ys(); ++n) {
            if (this.fO(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        for (n = 0; n < this.Yv(); ++n) {
            if (this.fQ(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        for (n = 0; n < this.Yy(); ++n) {
            if (this.fS(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.DJ);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.mj);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt64(3, this.DM);
        }
        if ((this.an & 8) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)5, (Object)this.bs);
        }
        if ((this.an & 0x10) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)6, (Object)this.DP);
        }
        if ((this.an & 0x20) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)7, (Object)this.DR);
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeInt32(8, this.DT);
        }
        if ((this.an & 0x80) != 0) {
            codedOutputStream.writeInt32(9, this.DV);
        }
        if ((this.an & 0x100) != 0) {
            codedOutputStream.writeInt32(10, this.DX);
        }
        if ((this.an & 0x200) != 0) {
            codedOutputStream.writeInt32(11, this.DZ);
        }
        if ((this.an & 0x400) != 0) {
            codedOutputStream.writeInt32(12, this.Eb);
        }
        for (n = 0; n < this.Ed.size(); ++n) {
            codedOutputStream.writeMessage(13, (MessageLite)this.Ed.get(n));
        }
        for (n = 0; n < this.Ef.size(); ++n) {
            codedOutputStream.writeMessage(14, (MessageLite)this.Ef.get(n));
        }
        for (n = 0; n < this.Eh.size(); ++n) {
            codedOutputStream.writeMessage(15, (MessageLite)this.Eh.get(n));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.an & 1) != 0) {
            n2 += CodedOutputStream.computeInt64Size((int)1, (long)this.DJ);
        }
        if ((this.an & 2) != 0) {
            n2 += CodedOutputStream.computeInt32Size((int)2, (int)this.mj);
        }
        if ((this.an & 4) != 0) {
            n2 += CodedOutputStream.computeInt64Size((int)3, (long)this.DM);
        }
        if ((this.an & 8) != 0) {
            n2 += GeneratedMessageV3.computeStringSize((int)5, (Object)this.bs);
        }
        if ((this.an & 0x10) != 0) {
            n2 += GeneratedMessageV3.computeStringSize((int)6, (Object)this.DP);
        }
        if ((this.an & 0x20) != 0) {
            n2 += GeneratedMessageV3.computeStringSize((int)7, (Object)this.DR);
        }
        if ((this.an & 0x40) != 0) {
            n2 += CodedOutputStream.computeInt32Size((int)8, (int)this.DT);
        }
        if ((this.an & 0x80) != 0) {
            n2 += CodedOutputStream.computeInt32Size((int)9, (int)this.DV);
        }
        if ((this.an & 0x100) != 0) {
            n2 += CodedOutputStream.computeInt32Size((int)10, (int)this.DX);
        }
        if ((this.an & 0x200) != 0) {
            n2 += CodedOutputStream.computeInt32Size((int)11, (int)this.DZ);
        }
        if ((this.an & 0x400) != 0) {
            n2 += CodedOutputStream.computeInt32Size((int)12, (int)this.Eb);
        }
        for (n = 0; n < this.Ed.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)13, (MessageLite)((MessageLite)this.Ed.get(n)));
        }
        for (n = 0; n < this.Ef.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)14, (MessageLite)((MessageLite)this.Ef.get(n)));
        }
        for (n = 0; n < this.Eh.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)15, (MessageLite)((MessageLite)this.Eh.get(n)));
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof jt_2)) {
            return super.equals(object);
        }
        jt_2 jt_22 = (jt_2)object;
        if (this.XZ() != jt_22.XZ()) {
            return false;
        }
        if (this.XZ() && this.Ya() != jt_22.Ya()) {
            return false;
        }
        if (this.tK() != jt_22.tK()) {
            return false;
        }
        if (this.tK() && this.tL() != jt_22.tL()) {
            return false;
        }
        if (this.Yb() != jt_22.Yb()) {
            return false;
        }
        if (this.Yb() && this.Yc() != jt_22.Yc()) {
            return false;
        }
        if (this.wq() != jt_22.wq()) {
            return false;
        }
        if (this.wq() && !this.getName().equals(jt_22.getName())) {
            return false;
        }
        if (this.Yd() != jt_22.Yd()) {
            return false;
        }
        if (this.Yd() && !this.getDescription().equals(jt_22.getDescription())) {
            return false;
        }
        if (this.Q() != jt_22.Q()) {
            return false;
        }
        if (this.Q() && !this.getMessage().equals(jt_22.getMessage())) {
            return false;
        }
        if (this.Yg() != jt_22.Yg()) {
            return false;
        }
        if (this.Yg() && this.Yh() != jt_22.Yh()) {
            return false;
        }
        if (this.Yi() != jt_22.Yi()) {
            return false;
        }
        if (this.Yi() && this.Yj() != jt_22.Yj()) {
            return false;
        }
        if (this.Yk() != jt_22.Yk()) {
            return false;
        }
        if (this.Yk() && this.Yl() != jt_22.Yl()) {
            return false;
        }
        if (this.Ym() != jt_22.Ym()) {
            return false;
        }
        if (this.Ym() && this.Yn() != jt_22.Yn()) {
            return false;
        }
        if (this.Yo() != jt_22.Yo()) {
            return false;
        }
        if (this.Yo() && this.Yp() != jt_22.Yp()) {
            return false;
        }
        if (!this.Yq().equals(jt_22.Yq())) {
            return false;
        }
        if (!this.Yt().equals(jt_22.Yt())) {
            return false;
        }
        if (!this.Yw().equals(jt_22.Yw())) {
            return false;
        }
        return this.unknownFields.equals((Object)jt_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jt_2.XY().hashCode();
        if (this.XZ()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.Ya());
        }
        if (this.tK()) {
            n = 37 * n + 2;
            n = 53 * n + this.tL();
        }
        if (this.Yb()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.Yc());
        }
        if (this.wq()) {
            n = 37 * n + 5;
            n = 53 * n + this.getName().hashCode();
        }
        if (this.Yd()) {
            n = 37 * n + 6;
            n = 53 * n + this.getDescription().hashCode();
        }
        if (this.Q()) {
            n = 37 * n + 7;
            n = 53 * n + this.getMessage().hashCode();
        }
        if (this.Yg()) {
            n = 37 * n + 8;
            n = 53 * n + this.Yh();
        }
        if (this.Yi()) {
            n = 37 * n + 9;
            n = 53 * n + this.Yj();
        }
        if (this.Yk()) {
            n = 37 * n + 10;
            n = 53 * n + this.Yl();
        }
        if (this.Ym()) {
            n = 37 * n + 11;
            n = 53 * n + this.Yn();
        }
        if (this.Yo()) {
            n = 37 * n + 12;
            n = 53 * n + this.Yp();
        }
        if (this.Ys() > 0) {
            n = 37 * n + 13;
            n = 53 * n + this.Yq().hashCode();
        }
        if (this.Yv() > 0) {
            n = 37 * n + 14;
            n = 53 * n + this.Yt().hashCode();
        }
        if (this.Yy() > 0) {
            n = 37 * n + 15;
            n = 53 * n + this.Yw().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jt_2 bw(ByteBuffer byteBuffer) {
        return (jt_2)Ej.parseFrom(byteBuffer);
    }

    public static jt_2 bs(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jt_2)Ej.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jt_2 cu(ByteString byteString) {
        return (jt_2)Ej.parseFrom(byteString);
    }

    public static jt_2 bs(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jt_2)Ej.parseFrom(byteString, extensionRegistryLite);
    }

    public static jt_2 bt(byte[] byArray) {
        return (jt_2)Ej.parseFrom(byArray);
    }

    public static jt_2 bs(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jt_2)Ej.parseFrom(byArray, extensionRegistryLite);
    }

    public static jt_2 dK(InputStream inputStream) {
        return (jt_2)GeneratedMessageV3.parseWithIOException(Ej, (InputStream)inputStream);
    }

    public static jt_2 dK(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jt_2)GeneratedMessageV3.parseWithIOException(Ej, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jt_2 dL(InputStream inputStream) {
        return (jt_2)GeneratedMessageV3.parseDelimitedWithIOException(Ej, (InputStream)inputStream);
    }

    public static jt_2 dL(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jt_2)GeneratedMessageV3.parseDelimitedWithIOException(Ej, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jt_2 bs(CodedInputStream codedInputStream) {
        return (jt_2)GeneratedMessageV3.parseWithIOException(Ej, (CodedInputStream)codedInputStream);
    }

    public static jt_2 gc(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jt_2)GeneratedMessageV3.parseWithIOException(Ej, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public jv_2 Yz() {
        return jt_2.YA();
    }

    public static jv_2 YA() {
        return Ei.YB();
    }

    public static jv_2 a(jt_2 jt_22) {
        return Ei.YB().c(jt_22);
    }

    public jv_2 YB() {
        return this == Ei ? new jv_2() : new jv_2().c(this);
    }

    protected jv_2 bs(GeneratedMessageV3.BuilderParent builderParent) {
        jv_2 jv_22 = new jv_2(builderParent);
        return jv_22;
    }

    public static jt_2 YC() {
        return Ei;
    }

    public static Parser<jt_2> z() {
        return Ej;
    }

    public Parser<jt_2> getParserForType() {
        return Ej;
    }

    public jt_2 YD() {
        return Ei;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bs(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.YB();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Yz();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.YB();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Yz();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.YD();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.YD();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(jt_2 jt_22) {
        return jt_22.unknownFields;
    }
}

