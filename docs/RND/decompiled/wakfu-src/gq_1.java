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
 * Renamed from gQ
 */
public final class gq_1
extends GeneratedMessageV3
implements gx_0 {
    private static final long to = 0L;
    public static final int tp = 1;
    List<gt_0> tq;
    private byte Y = (byte)-1;
    private static final gq_1 tr = new gq_1();
    @Deprecated
    public static final Parser<gq_1> ts = new gr_1();

    gq_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private gq_1() {
        this.tq = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new gq_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    gq_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.tq = new ArrayList<gt_0>();
                            bl |= true;
                        }
                        this.tq.add((gt_0)codedInputStream.readMessage(gt_0.tA, extensionRegistryLite));
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
                this.tq = Collections.unmodifiableList(this.tq);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor FZ() {
        return gl_0.sS;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gl_0.sT.ensureFieldAccessorsInitialized(gq_1.class, gs_1.class);
    }

    @Override
    public List<gt_0> Ga() {
        return this.tq;
    }

    @Override
    public List<? extends gw_0> Gb() {
        return this.tq;
    }

    @Override
    public int Gc() {
        return this.tq.size();
    }

    @Override
    public gt_0 di(int n) {
        return this.tq.get(n);
    }

    @Override
    public gw_0 dj(int n) {
        return this.tq.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.Gc(); ++i) {
            if (this.di(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.tq.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.tq.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.tq.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.tq.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof gq_1)) {
            return super.equals(object);
        }
        gq_1 gq_12 = (gq_1)object;
        if (!this.Ga().equals(gq_12.Ga())) {
            return false;
        }
        return this.unknownFields.equals((Object)gq_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + gq_1.FZ().hashCode();
        if (this.Gc() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.Ga().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static gq_1 aM(ByteBuffer byteBuffer) {
        return (gq_1)ts.parseFrom(byteBuffer);
    }

    public static gq_1 aI(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (gq_1)ts.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static gq_1 bB(ByteString byteString) {
        return (gq_1)ts.parseFrom(byteString);
    }

    public static gq_1 aI(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (gq_1)ts.parseFrom(byteString, extensionRegistryLite);
    }

    public static gq_1 aJ(byte[] byArray) {
        return (gq_1)ts.parseFrom(byArray);
    }

    public static gq_1 aI(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (gq_1)ts.parseFrom(byArray, extensionRegistryLite);
    }

    public static gq_1 cq(InputStream inputStream) {
        return (gq_1)GeneratedMessageV3.parseWithIOException(ts, (InputStream)inputStream);
    }

    public static gq_1 cq(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gq_1)GeneratedMessageV3.parseWithIOException(ts, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gq_1 cr(InputStream inputStream) {
        return (gq_1)GeneratedMessageV3.parseDelimitedWithIOException(ts, (InputStream)inputStream);
    }

    public static gq_1 cr(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gq_1)GeneratedMessageV3.parseDelimitedWithIOException(ts, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gq_1 aI(CodedInputStream codedInputStream) {
        return (gq_1)GeneratedMessageV3.parseWithIOException(ts, (CodedInputStream)codedInputStream);
    }

    public static gq_1 dY(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gq_1)GeneratedMessageV3.parseWithIOException(ts, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public gs_1 Gd() {
        return gq_1.Ge();
    }

    public static gs_1 Ge() {
        return tr.Gf();
    }

    public static gs_1 a(gq_1 gq_12) {
        return tr.Gf().c(gq_12);
    }

    public gs_1 Gf() {
        return this == tr ? new gs_1() : new gs_1().c(this);
    }

    protected gs_1 aI(GeneratedMessageV3.BuilderParent builderParent) {
        gs_1 gs_12 = new gs_1(builderParent);
        return gs_12;
    }

    public static gq_1 Gg() {
        return tr;
    }

    public static Parser<gq_1> z() {
        return ts;
    }

    public Parser<gq_1> getParserForType() {
        return ts;
    }

    public gq_1 Gh() {
        return tr;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aI(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Gf();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Gd();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Gf();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Gd();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Gh();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Gh();
    }

    static /* synthetic */ boolean el() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean cs() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(gq_1 gq_12) {
        return gq_12.unknownFields;
    }
}

