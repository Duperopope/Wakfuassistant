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

public final class hZ
extends GeneratedMessageV3
implements ig {
    private static final long wj = 0L;
    int an;
    public static final int wk = 1;
    List<ic> jj;
    public static final int wl = 53;
    int mj;
    private byte Y = (byte)-1;
    private static final hZ wm = new hZ();
    @Deprecated
    public static final Parser<hZ> wn = new ia();

    hZ(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private hZ() {
        this.jj = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new hZ();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    hZ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.jj = new ArrayList<ic>();
                            bl |= true;
                        }
                        this.jj.add((ic)codedInputStream.readMessage(ic.wu, extensionRegistryLite));
                        continue block12;
                    }
                    case 424: {
                        this.an |= 1;
                        this.mj = codedInputStream.readInt32();
                        continue block12;
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
                this.jj = Collections.unmodifiableList(this.jj);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor Lh() {
        return hL.vG;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hL.vH.ensureFieldAccessorsInitialized(hZ.class, ib.class);
    }

    @Override
    public List<ic> ot() {
        return this.jj;
    }

    @Override
    public List<? extends if> ou() {
        return this.jj;
    }

    @Override
    public int ov() {
        return this.jj.size();
    }

    @Override
    public ic ed(int n) {
        return this.jj.get(n);
    }

    @Override
    public if ee(int n) {
        return this.jj.get(n);
    }

    @Override
    public boolean tK() {
        return (this.an & 1) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.ov(); ++i) {
            if (this.ed(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.jj.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.jj.get(i));
        }
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(53, this.mj);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.jj.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.jj.get(i)));
        }
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeInt32Size((int)53, (int)this.mj);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof hZ)) {
            return super.equals(object);
        }
        hZ hZ2 = (hZ)object;
        if (!this.ot().equals(hZ2.ot())) {
            return false;
        }
        if (this.tK() != hZ2.tK()) {
            return false;
        }
        if (this.tK() && this.tL() != hZ2.tL()) {
            return false;
        }
        return this.unknownFields.equals((Object)hZ2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + hZ.Lh().hashCode();
        if (this.ov() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.ot().hashCode();
        }
        if (this.tK()) {
            n = 37 * n + 53;
            n = 53 * n + this.tL();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static hZ aZ(ByteBuffer byteBuffer) {
        return (hZ)wn.parseFrom(byteBuffer);
    }

    public static hZ aV(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (hZ)wn.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static hZ bQ(ByteString byteString) {
        return (hZ)wn.parseFrom(byteString);
    }

    public static hZ aV(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (hZ)wn.parseFrom(byteString, extensionRegistryLite);
    }

    public static hZ aW(byte[] byArray) {
        return (hZ)wn.parseFrom(byArray);
    }

    public static hZ aV(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (hZ)wn.parseFrom(byArray, extensionRegistryLite);
    }

    public static hZ cQ(InputStream inputStream) {
        return (hZ)GeneratedMessageV3.parseWithIOException(wn, (InputStream)inputStream);
    }

    public static hZ cQ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hZ)GeneratedMessageV3.parseWithIOException(wn, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hZ cR(InputStream inputStream) {
        return (hZ)GeneratedMessageV3.parseDelimitedWithIOException(wn, (InputStream)inputStream);
    }

    public static hZ cR(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hZ)GeneratedMessageV3.parseDelimitedWithIOException(wn, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hZ aV(CodedInputStream codedInputStream) {
        return (hZ)GeneratedMessageV3.parseWithIOException(wn, (CodedInputStream)codedInputStream);
    }

    public static hZ eL(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hZ)GeneratedMessageV3.parseWithIOException(wn, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ib Li() {
        return hZ.Lj();
    }

    public static ib Lj() {
        return wm.Lk();
    }

    public static ib a(hZ hZ2) {
        return wm.Lk().c(hZ2);
    }

    public ib Lk() {
        return this == wm ? new ib() : new ib().c(this);
    }

    protected ib aV(GeneratedMessageV3.BuilderParent builderParent) {
        ib ib2 = new ib(builderParent);
        return ib2;
    }

    public static hZ Ll() {
        return wm;
    }

    public static Parser<hZ> z() {
        return wn;
    }

    public Parser<hZ> getParserForType() {
        return wn;
    }

    public hZ Lm() {
        return wm;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aV(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Lk();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Li();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Lk();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Li();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Lm();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Lm();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(hZ hZ2) {
        return hZ2.unknownFields;
    }
}

