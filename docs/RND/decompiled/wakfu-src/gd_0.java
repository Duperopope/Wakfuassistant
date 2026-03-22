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
 * Renamed from gD
 */
public final class gd_0
extends GeneratedMessageV3
implements gK {
    private static final long sB = 0L;
    public static final int sC = 1;
    List<gG> sD;
    private byte Y = (byte)-1;
    private static final gd_0 sE = new gd_0();
    @Deprecated
    public static final Parser<gd_0> sF = new ge_0();

    gd_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private gd_0() {
        this.sD = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new gd_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    gd_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.sD = new ArrayList<gG>();
                            bl |= true;
                        }
                        this.sD.add((gG)codedInputStream.readMessage(gG.sP, extensionRegistryLite));
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
                this.sD = Collections.unmodifiableList(this.sD);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor EB() {
        return gc_0.sx;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gc_0.sy.ensureFieldAccessorsInitialized(gd_0.class, gf_0.class);
    }

    @Override
    public List<gG> EC() {
        return this.sD;
    }

    @Override
    public List<? extends gJ> ED() {
        return this.sD;
    }

    @Override
    public int EE() {
        return this.sD.size();
    }

    @Override
    public gG cY(int n) {
        return this.sD.get(n);
    }

    @Override
    public gJ cZ(int n) {
        return this.sD.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.EE(); ++i) {
            if (this.cY(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.sD.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.sD.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.sD.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.sD.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof gd_0)) {
            return super.equals(object);
        }
        gd_0 gd_02 = (gd_0)object;
        if (!this.EC().equals(gd_02.EC())) {
            return false;
        }
        return this.unknownFields.equals((Object)gd_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + gd_0.EB().hashCode();
        if (this.EE() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.EC().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static gd_0 aJ(ByteBuffer byteBuffer) {
        return (gd_0)sF.parseFrom(byteBuffer);
    }

    public static gd_0 aF(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (gd_0)sF.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static gd_0 by(ByteString byteString) {
        return (gd_0)sF.parseFrom(byteString);
    }

    public static gd_0 aF(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (gd_0)sF.parseFrom(byteString, extensionRegistryLite);
    }

    public static gd_0 aG(byte[] byArray) {
        return (gd_0)sF.parseFrom(byArray);
    }

    public static gd_0 aF(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (gd_0)sF.parseFrom(byArray, extensionRegistryLite);
    }

    public static gd_0 ck(InputStream inputStream) {
        return (gd_0)GeneratedMessageV3.parseWithIOException(sF, (InputStream)inputStream);
    }

    public static gd_0 ck(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gd_0)GeneratedMessageV3.parseWithIOException(sF, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gd_0 cl(InputStream inputStream) {
        return (gd_0)GeneratedMessageV3.parseDelimitedWithIOException(sF, (InputStream)inputStream);
    }

    public static gd_0 cl(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gd_0)GeneratedMessageV3.parseDelimitedWithIOException(sF, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gd_0 aF(CodedInputStream codedInputStream) {
        return (gd_0)GeneratedMessageV3.parseWithIOException(sF, (CodedInputStream)codedInputStream);
    }

    public static gd_0 dP(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gd_0)GeneratedMessageV3.parseWithIOException(sF, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public gf_0 EF() {
        return gd_0.EG();
    }

    public static gf_0 EG() {
        return sE.EH();
    }

    public static gf_0 a(gd_0 gd_02) {
        return sE.EH().c(gd_02);
    }

    public gf_0 EH() {
        return this == sE ? new gf_0() : new gf_0().c(this);
    }

    protected gf_0 aF(GeneratedMessageV3.BuilderParent builderParent) {
        gf_0 gf_02 = new gf_0(builderParent);
        return gf_02;
    }

    public static gd_0 EI() {
        return sE;
    }

    public static Parser<gd_0> z() {
        return sF;
    }

    public Parser<gd_0> getParserForType() {
        return sF;
    }

    public gd_0 EJ() {
        return sE;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aF(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.EH();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.EF();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.EH();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.EF();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.EJ();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.EJ();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(gd_0 gd_02) {
        return gd_02.unknownFields;
    }
}

