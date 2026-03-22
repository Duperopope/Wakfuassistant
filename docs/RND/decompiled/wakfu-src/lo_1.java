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
 * Renamed from lO
 */
public final class lo_1
extends GeneratedMessageV3
implements lr_1 {
    private static final long Ji = 0L;
    public static final int Jj = 1;
    List<kW> jj;
    private byte Y = (byte)-1;
    private static final lo_1 Jk = new lo_1();
    @Deprecated
    public static final Parser<lo_1> Jl = new lp_1();

    lo_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private lo_1() {
        this.jj = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new lo_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    lo_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.jj = new ArrayList<kW>();
                            bl |= true;
                        }
                        this.jj.add((kW)codedInputStream.readMessage(kW.Hs, extensionRegistryLite));
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
                this.jj = Collections.unmodifiableList(this.jj);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor aiK() {
        return kF.Go;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gp.ensureFieldAccessorsInitialized(lo_1.class, lq_0.class);
    }

    @Override
    public List<kW> ot() {
        return this.jj;
    }

    @Override
    public List<? extends lh> ou() {
        return this.jj;
    }

    @Override
    public int ov() {
        return this.jj.size();
    }

    @Override
    public kW dW(int n) {
        return this.jj.get(n);
    }

    @Override
    public lh dX(int n) {
        return this.jj.get(n);
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
            if (this.dW(i).isInitialized()) continue;
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
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof lo_1)) {
            return super.equals(object);
        }
        lo_1 lo_12 = (lo_1)object;
        if (!this.ot().equals(lo_12.ot())) {
            return false;
        }
        return this.unknownFields.equals((Object)lo_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + lo_1.aiK().hashCode();
        if (this.ov() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.ot().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static lo_1 bU(ByteBuffer byteBuffer) {
        return (lo_1)Jl.parseFrom(byteBuffer);
    }

    public static lo_1 bQ(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (lo_1)Jl.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static lo_1 da(ByteString byteString) {
        return (lo_1)Jl.parseFrom(byteString);
    }

    public static lo_1 bQ(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (lo_1)Jl.parseFrom(byteString, extensionRegistryLite);
    }

    public static lo_1 bR(byte[] byArray) {
        return (lo_1)Jl.parseFrom(byArray);
    }

    public static lo_1 bQ(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (lo_1)Jl.parseFrom(byArray, extensionRegistryLite);
    }

    public static lo_1 eG(InputStream inputStream) {
        return (lo_1)GeneratedMessageV3.parseWithIOException(Jl, (InputStream)inputStream);
    }

    public static lo_1 eG(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lo_1)GeneratedMessageV3.parseWithIOException(Jl, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lo_1 eH(InputStream inputStream) {
        return (lo_1)GeneratedMessageV3.parseDelimitedWithIOException(Jl, (InputStream)inputStream);
    }

    public static lo_1 eH(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lo_1)GeneratedMessageV3.parseDelimitedWithIOException(Jl, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lo_1 bQ(CodedInputStream codedInputStream) {
        return (lo_1)GeneratedMessageV3.parseWithIOException(Jl, (CodedInputStream)codedInputStream);
    }

    public static lo_1 hw(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lo_1)GeneratedMessageV3.parseWithIOException(Jl, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public lq_0 aiL() {
        return lo_1.aiM();
    }

    public static lq_0 aiM() {
        return Jk.aiN();
    }

    public static lq_0 a(lo_1 lo_12) {
        return Jk.aiN().c(lo_12);
    }

    public lq_0 aiN() {
        return this == Jk ? new lq_0() : new lq_0().c(this);
    }

    protected lq_0 bQ(GeneratedMessageV3.BuilderParent builderParent) {
        lq_0 lq_02 = new lq_0(builderParent);
        return lq_02;
    }

    public static lo_1 aiO() {
        return Jk;
    }

    public static Parser<lo_1> z() {
        return Jl;
    }

    public Parser<lo_1> getParserForType() {
        return Jl;
    }

    public lo_1 aiP() {
        return Jk;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bQ(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aiN();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aiL();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aiN();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aiL();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aiP();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aiP();
    }

    static /* synthetic */ boolean aiQ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean mx() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(lo_1 lo_12) {
        return lo_12.unknownFields;
    }
}

