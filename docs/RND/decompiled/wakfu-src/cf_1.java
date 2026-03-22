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
 * Renamed from cF
 */
public final class cf_1
extends GeneratedMessageV3
implements ci_1 {
    private static final long iu = 0L;
    public static final int iv = 1;
    List<bw_2> ak;
    private byte Y = (byte)-1;
    private static final cf_1 iw = new cf_1();
    static final Parser<cf_1> ix = new cg_2();

    cf_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private cf_1() {
        this.ak = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new cf_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    cf_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.ak = new ArrayList<bw_2>();
                            bl |= true;
                        }
                        this.ak.add((bw_2)codedInputStream.readMessage(bw_2.z(), extensionRegistryLite));
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
                this.ak = Collections.unmodifiableList(this.ak);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor nv() {
        return ae_1.fy;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fz.ensureFieldAccessorsInitialized(cf_1.class, ch_1.class);
    }

    @Override
    public List<bw_2> ai() {
        return this.ak;
    }

    @Override
    public List<? extends cj_2> aj() {
        return this.ak;
    }

    @Override
    public int ak() {
        return this.ak.size();
    }

    @Override
    public bw_2 W(int n) {
        return this.ak.get(n);
    }

    @Override
    public cj_2 X(int n) {
        return this.ak.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.ak.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.ak.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.ak.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.ak.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof cf_1)) {
            return super.equals(object);
        }
        cf_1 cf_12 = (cf_1)object;
        if (!this.ai().equals(cf_12.ai())) {
            return false;
        }
        return this.unknownFields.equals((Object)cf_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + cf_1.nv().hashCode();
        if (this.ak() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.ai().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static cf_1 Q(ByteBuffer byteBuffer) {
        return (cf_1)ix.parseFrom(byteBuffer);
    }

    public static cf_1 Q(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (cf_1)ix.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static cf_1 ay(ByteString byteString) {
        return (cf_1)ix.parseFrom(byteString);
    }

    public static cf_1 Q(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (cf_1)ix.parseFrom(byteString, extensionRegistryLite);
    }

    public static cf_1 Q(byte[] byArray) {
        return (cf_1)ix.parseFrom(byArray);
    }

    public static cf_1 Q(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (cf_1)ix.parseFrom(byArray, extensionRegistryLite);
    }

    public static cf_1 aG(InputStream inputStream) {
        return (cf_1)GeneratedMessageV3.parseWithIOException(ix, (InputStream)inputStream);
    }

    public static cf_1 aG(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cf_1)GeneratedMessageV3.parseWithIOException(ix, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cf_1 aH(InputStream inputStream) {
        return (cf_1)GeneratedMessageV3.parseDelimitedWithIOException(ix, (InputStream)inputStream);
    }

    public static cf_1 aH(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cf_1)GeneratedMessageV3.parseDelimitedWithIOException(ix, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cf_1 Q(CodedInputStream codedInputStream) {
        return (cf_1)GeneratedMessageV3.parseWithIOException(ix, (CodedInputStream)codedInputStream);
    }

    public static cf_1 bw(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cf_1)GeneratedMessageV3.parseWithIOException(ix, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ch_1 nw() {
        return cf_1.nx();
    }

    public static ch_1 nx() {
        return iw.ny();
    }

    public static ch_1 a(cf_1 cf_12) {
        return iw.ny().c(cf_12);
    }

    public ch_1 ny() {
        return this == iw ? new ch_1() : new ch_1().c(this);
    }

    protected ch_1 Q(GeneratedMessageV3.BuilderParent builderParent) {
        ch_1 ch_12 = new ch_1(builderParent);
        return ch_12;
    }

    public static cf_1 nz() {
        return iw;
    }

    public static Parser<cf_1> z() {
        return ix;
    }

    public Parser<cf_1> getParserForType() {
        return ix;
    }

    public cf_1 nA() {
        return iw;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.Q(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.ny();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.nw();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.ny();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.nw();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.nA();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.nA();
    }

    static /* synthetic */ boolean nB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean nC() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(cf_1 cf_12) {
        return cf_12.unknownFields;
    }
}

