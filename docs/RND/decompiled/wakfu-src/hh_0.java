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
 * Renamed from hH
 */
public final class hh_0
extends GeneratedMessageV3
implements hk_0 {
    private static final long vA = 0L;
    public static final int vB = 1;
    List<hd_0> vC;
    private byte Y = (byte)-1;
    private static final hh_0 vD = new hh_0();
    @Deprecated
    public static final Parser<hh_0> vE = new hi_0();

    hh_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private hh_0() {
        this.vC = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new hh_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    hh_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.vC = new ArrayList<hd_0>();
                            bl |= true;
                        }
                        this.vC.add((hd_0)codedInputStream.readMessage(hd_0.vz, extensionRegistryLite));
                        continue block11;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
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
            if (bl & true) {
                this.vC = Collections.unmodifiableList(this.vC);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor JT() {
        return hc_0.vu;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hc_0.vv.ensureFieldAccessorsInitialized(hh_0.class, hj_0.class);
    }

    @Override
    public List<hd_0> JU() {
        return this.vC;
    }

    @Override
    public List<? extends hg_0> JV() {
        return this.vC;
    }

    @Override
    public int JW() {
        return this.vC.size();
    }

    @Override
    public hd_0 dM(int n) {
        return this.vC.get(n);
    }

    @Override
    public hg_0 dN(int n) {
        return this.vC.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.JW(); ++i) {
            if (this.dM(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.vC.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.vC.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.vC.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.vC.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof hh_0)) {
            return super.equals(object);
        }
        hh_0 hh_02 = (hh_0)object;
        if (!this.JU().equals(hh_02.JU())) {
            return false;
        }
        return this.unknownFields.equals((Object)hh_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + hh_0.JT().hashCode();
        if (this.JW() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.JU().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static hh_0 aV(ByteBuffer byteBuffer) {
        return (hh_0)vE.parseFrom(byteBuffer);
    }

    public static hh_0 aR(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (hh_0)vE.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static hh_0 bM(ByteString byteString) {
        return (hh_0)vE.parseFrom(byteString);
    }

    public static hh_0 aR(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (hh_0)vE.parseFrom(byteString, extensionRegistryLite);
    }

    public static hh_0 aS(byte[] byArray) {
        return (hh_0)vE.parseFrom(byArray);
    }

    public static hh_0 aR(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (hh_0)vE.parseFrom(byArray, extensionRegistryLite);
    }

    public static hh_0 cI(InputStream inputStream) {
        return (hh_0)GeneratedMessageV3.parseWithIOException(vE, (InputStream)inputStream);
    }

    public static hh_0 cI(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hh_0)GeneratedMessageV3.parseWithIOException(vE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hh_0 cJ(InputStream inputStream) {
        return (hh_0)GeneratedMessageV3.parseDelimitedWithIOException(vE, (InputStream)inputStream);
    }

    public static hh_0 cJ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hh_0)GeneratedMessageV3.parseDelimitedWithIOException(vE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hh_0 aR(CodedInputStream codedInputStream) {
        return (hh_0)GeneratedMessageV3.parseWithIOException(vE, (CodedInputStream)codedInputStream);
    }

    public static hh_0 ez(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hh_0)GeneratedMessageV3.parseWithIOException(vE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public hj_0 JX() {
        return hh_0.JY();
    }

    public static hj_0 JY() {
        return vD.JZ();
    }

    public static hj_0 a(hh_0 hh_02) {
        return vD.JZ().c(hh_02);
    }

    public hj_0 JZ() {
        return this == vD ? new hj_0() : new hj_0().c(this);
    }

    protected hj_0 aR(GeneratedMessageV3.BuilderParent builderParent) {
        hj_0 hj_02 = new hj_0(builderParent);
        return hj_02;
    }

    public static hh_0 Ka() {
        return vD;
    }

    public static Parser<hh_0> z() {
        return vE;
    }

    public Parser<hh_0> getParserForType() {
        return vE;
    }

    public hh_0 Kb() {
        return vD;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aR(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.JZ();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.JX();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.JZ();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.JX();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Kb();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Kb();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(hh_0 hh_02) {
        return hh_02.unknownFields;
    }
}

