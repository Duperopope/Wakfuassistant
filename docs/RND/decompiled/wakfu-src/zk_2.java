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
 * Renamed from zk
 */
public final class zk_2
extends GeneratedMessageV3
implements zn_1 {
    private static final long anE = 0L;
    public static final int anF = 1;
    List<zh_2> anG;
    private byte Y = (byte)-1;
    private static final zk_2 anH = new zk_2();
    @Deprecated
    public static final Parser<zk_2> anI = new zl_2();

    zk_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private zk_2() {
        this.anG = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new zk_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    zk_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.anG = new ArrayList<zh_2>();
                            bl |= true;
                        }
                        this.anG.add((zh_2)codedInputStream.readMessage(zh_2.anD, extensionRegistryLite));
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
                this.anG = Collections.unmodifiableList(this.anG);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor axO() {
        return zg_2.ant;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zg_2.anu.ensureFieldAccessorsInitialized(zk_2.class, zm_2.class);
    }

    @Override
    public List<zh_2> axP() {
        return this.anG;
    }

    @Override
    public List<? extends zo_1> axQ() {
        return this.anG;
    }

    @Override
    public int axR() {
        return this.anG.size();
    }

    @Override
    public zh_2 kp(int n) {
        return this.anG.get(n);
    }

    @Override
    public zo_1 kq(int n) {
        return this.anG.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.axR(); ++i) {
            if (this.kp(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.anG.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.anG.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.anG.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.anG.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof zk_2)) {
            return super.equals(object);
        }
        zk_2 zk_22 = (zk_2)object;
        if (!this.axP().equals(zk_22.axP())) {
            return false;
        }
        return this.unknownFields.equals((Object)zk_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + zk_2.axO().hashCode();
        if (this.axR() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.axP().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static zk_2 ej(ByteBuffer byteBuffer) {
        return (zk_2)anI.parseFrom(byteBuffer);
    }

    public static zk_2 cx(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (zk_2)anI.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static zk_2 dY(ByteString byteString) {
        return (zk_2)anI.parseFrom(byteString);
    }

    public static zk_2 cx(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (zk_2)anI.parseFrom(byteString, extensionRegistryLite);
    }

    public static zk_2 cz(byte[] byArray) {
        return (zk_2)anI.parseFrom(byArray);
    }

    public static zk_2 cx(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (zk_2)anI.parseFrom(byArray, extensionRegistryLite);
    }

    public static zk_2 fU(InputStream inputStream) {
        return (zk_2)GeneratedMessageV3.parseWithIOException(anI, (InputStream)inputStream);
    }

    public static zk_2 fU(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zk_2)GeneratedMessageV3.parseWithIOException(anI, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zk_2 fV(InputStream inputStream) {
        return (zk_2)GeneratedMessageV3.parseDelimitedWithIOException(anI, (InputStream)inputStream);
    }

    public static zk_2 fV(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zk_2)GeneratedMessageV3.parseDelimitedWithIOException(anI, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zk_2 cx(CodedInputStream codedInputStream) {
        return (zk_2)GeneratedMessageV3.parseWithIOException(anI, (CodedInputStream)codedInputStream);
    }

    public static zk_2 jr(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zk_2)GeneratedMessageV3.parseWithIOException(anI, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public zm_2 axS() {
        return zk_2.axT();
    }

    public static zm_2 axT() {
        return anH.axU();
    }

    public static zm_2 c(zk_2 zk_22) {
        return anH.axU().e(zk_22);
    }

    public zm_2 axU() {
        return this == anH ? new zm_2() : new zm_2().e(this);
    }

    protected zm_2 cx(GeneratedMessageV3.BuilderParent builderParent) {
        zm_2 zm_22 = new zm_2(builderParent);
        return zm_22;
    }

    public static zk_2 axV() {
        return anH;
    }

    public static Parser<zk_2> z() {
        return anI;
    }

    public Parser<zk_2> getParserForType() {
        return anI;
    }

    public zk_2 axW() {
        return anH;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cx(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.axU();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.axS();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.axU();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.axS();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.axW();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.axW();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(zk_2 zk_22) {
        return zk_22.unknownFields;
    }
}

