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

public final class zT
extends GeneratedMessageV3
implements Aa {
    private static final long apF = 0L;
    public static final int apG = 1;
    List<zW> apH;
    private byte Y = (byte)-1;
    private static final zT apI = new zT();
    @Deprecated
    public static final Parser<zT> apJ = new zU();

    zT(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private zT() {
        this.apH = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new zT();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    zT(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.apH = new ArrayList<zW>();
                            bl |= true;
                        }
                        this.apH.add((zW)codedInputStream.readMessage(zW.apQ, extensionRegistryLite));
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
                this.apH = Collections.unmodifiableList(this.apH);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor aAQ() {
        return zS.apf;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apg.ensureFieldAccessorsInitialized(zT.class, zV.class);
    }

    @Override
    public List<zW> aAR() {
        return this.apH;
    }

    @Override
    public List<? extends zZ> aAS() {
        return this.apH;
    }

    @Override
    public int aAT() {
        return this.apH.size();
    }

    @Override
    public zW lf(int n) {
        return this.apH.get(n);
    }

    @Override
    public zZ lg(int n) {
        return this.apH.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.aAT(); ++i) {
            if (this.lf(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.apH.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.apH.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.apH.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.apH.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof zT)) {
            return super.equals(object);
        }
        zT zT2 = (zT)object;
        if (!this.aAR().equals(zT2.aAR())) {
            return false;
        }
        return this.unknownFields.equals((Object)zT2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + zT.aAQ().hashCode();
        if (this.aAT() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.aAR().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static zT eq(ByteBuffer byteBuffer) {
        return (zT)apJ.parseFrom(byteBuffer);
    }

    public static zT cE(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (zT)apJ.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static zT ef(ByteString byteString) {
        return (zT)apJ.parseFrom(byteString);
    }

    public static zT cE(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (zT)apJ.parseFrom(byteString, extensionRegistryLite);
    }

    public static zT cG(byte[] byArray) {
        return (zT)apJ.parseFrom(byArray);
    }

    public static zT cE(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (zT)apJ.parseFrom(byArray, extensionRegistryLite);
    }

    public static zT gi(InputStream inputStream) {
        return (zT)GeneratedMessageV3.parseWithIOException(apJ, (InputStream)inputStream);
    }

    public static zT gi(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zT)GeneratedMessageV3.parseWithIOException(apJ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zT gj(InputStream inputStream) {
        return (zT)GeneratedMessageV3.parseDelimitedWithIOException(apJ, (InputStream)inputStream);
    }

    public static zT gj(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zT)GeneratedMessageV3.parseDelimitedWithIOException(apJ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zT cE(CodedInputStream codedInputStream) {
        return (zT)GeneratedMessageV3.parseWithIOException(apJ, (CodedInputStream)codedInputStream);
    }

    public static zT jM(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zT)GeneratedMessageV3.parseWithIOException(apJ, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public zV aAU() {
        return zT.aAV();
    }

    public static zV aAV() {
        return apI.aAW();
    }

    public static zV a(zT zT2) {
        return apI.aAW().c(zT2);
    }

    public zV aAW() {
        return this == apI ? new zV() : new zV().c(this);
    }

    protected zV cE(GeneratedMessageV3.BuilderParent builderParent) {
        zV zV2 = new zV(builderParent);
        return zV2;
    }

    public static zT aAX() {
        return apI;
    }

    public static Parser<zT> z() {
        return apJ;
    }

    public Parser<zT> getParserForType() {
        return apJ;
    }

    public zT aAY() {
        return apI;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cE(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aAW();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aAU();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aAW();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aAU();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aAY();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aAY();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(zT zT2) {
        return zT2.unknownFields;
    }
}

