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

public final class hM
extends GeneratedMessageV3
implements hP {
    private static final long vS = 0L;
    public static final int vT = 1;
    List<hU> vU;
    private byte Y = (byte)-1;
    private static final hM vV = new hM();
    @Deprecated
    public static final Parser<hM> vW = new hN();

    hM(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private hM() {
        this.vU = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new hM();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    hM(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.vU = new ArrayList<hU>();
                            bl |= true;
                        }
                        this.vU.add((hU)codedInputStream.readMessage(hU.wh, extensionRegistryLite));
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
                this.vU = Collections.unmodifiableList(this.vU);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor Km() {
        return hL.vO;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hL.vP.ensureFieldAccessorsInitialized(hM.class, hO.class);
    }

    @Override
    public List<hU> Kn() {
        return this.vU;
    }

    @Override
    public List<? extends hY> Ko() {
        return this.vU;
    }

    @Override
    public int Kp() {
        return this.vU.size();
    }

    @Override
    public hU dR(int n) {
        return this.vU.get(n);
    }

    @Override
    public hY dS(int n) {
        return this.vU.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.Kp(); ++i) {
            if (this.dR(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.vU.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.vU.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.vU.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.vU.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof hM)) {
            return super.equals(object);
        }
        hM hM2 = (hM)object;
        if (!this.Kn().equals(hM2.Kn())) {
            return false;
        }
        return this.unknownFields.equals((Object)hM2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + hM.Km().hashCode();
        if (this.Kp() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.Kn().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static hM aW(ByteBuffer byteBuffer) {
        return (hM)vW.parseFrom(byteBuffer);
    }

    public static hM aS(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (hM)vW.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static hM bN(ByteString byteString) {
        return (hM)vW.parseFrom(byteString);
    }

    public static hM aS(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (hM)vW.parseFrom(byteString, extensionRegistryLite);
    }

    public static hM aT(byte[] byArray) {
        return (hM)vW.parseFrom(byArray);
    }

    public static hM aS(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (hM)vW.parseFrom(byArray, extensionRegistryLite);
    }

    public static hM cK(InputStream inputStream) {
        return (hM)GeneratedMessageV3.parseWithIOException(vW, (InputStream)inputStream);
    }

    public static hM cK(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hM)GeneratedMessageV3.parseWithIOException(vW, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hM cL(InputStream inputStream) {
        return (hM)GeneratedMessageV3.parseDelimitedWithIOException(vW, (InputStream)inputStream);
    }

    public static hM cL(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hM)GeneratedMessageV3.parseDelimitedWithIOException(vW, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hM aS(CodedInputStream codedInputStream) {
        return (hM)GeneratedMessageV3.parseWithIOException(vW, (CodedInputStream)codedInputStream);
    }

    public static hM eC(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hM)GeneratedMessageV3.parseWithIOException(vW, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public hO Kq() {
        return hM.Kr();
    }

    public static hO Kr() {
        return vV.Ks();
    }

    public static hO a(hM hM2) {
        return vV.Ks().c(hM2);
    }

    public hO Ks() {
        return this == vV ? new hO() : new hO().c(this);
    }

    protected hO aS(GeneratedMessageV3.BuilderParent builderParent) {
        hO hO2 = new hO(builderParent);
        return hO2;
    }

    public static hM Kt() {
        return vV;
    }

    public static Parser<hM> z() {
        return vW;
    }

    public Parser<hM> getParserForType() {
        return vW;
    }

    public hM Ku() {
        return vV;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aS(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Ks();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Kq();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Ks();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Kq();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Ku();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Ku();
    }

    static /* synthetic */ boolean cs() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean ju() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(hM hM2) {
        return hM2.unknownFields;
    }
}

