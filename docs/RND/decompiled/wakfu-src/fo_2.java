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
 * Renamed from fo
 */
public final class fo_2
extends GeneratedMessageV3
implements fr_2 {
    private static final long qe = 0L;
    public static final int qf = 1;
    List<fb_2> qg;
    private byte Y = (byte)-1;
    private static final fo_2 qh = new fo_2();
    @Deprecated
    public static final Parser<fo_2> qi = new fp_2();

    fo_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private fo_2() {
        this.qg = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new fo_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    fo_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.qg = new ArrayList<fb_2>();
                            bl |= true;
                        }
                        this.qg.add((fb_2)codedInputStream.readMessage(fb_2.qH, extensionRegistryLite));
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
                this.qg = Collections.unmodifiableList(this.qg);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor zx() {
        return fl_1.pk;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fl_1.pl.ensureFieldAccessorsInitialized(fo_2.class, fq_1.class);
    }

    @Override
    public List<fb_2> zy() {
        return this.qg;
    }

    @Override
    public List<? extends fe_2> zz() {
        return this.qg;
    }

    @Override
    public int zA() {
        return this.qg.size();
    }

    @Override
    public fb_2 cg(int n) {
        return this.qg.get(n);
    }

    @Override
    public fe_2 ch(int n) {
        return this.qg.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.zA(); ++i) {
            if (this.cg(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.qg.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.qg.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.qg.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.qg.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fo_2)) {
            return super.equals(object);
        }
        fo_2 fo_22 = (fo_2)object;
        if (!this.zy().equals(fo_22.zy())) {
            return false;
        }
        return this.unknownFields.equals((Object)fo_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + fo_2.zx().hashCode();
        if (this.zA() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.zy().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static fo_2 au(ByteBuffer byteBuffer) {
        return (fo_2)qi.parseFrom(byteBuffer);
    }

    public static fo_2 as(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (fo_2)qi.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static fo_2 bk(ByteString byteString) {
        return (fo_2)qi.parseFrom(byteString);
    }

    public static fo_2 as(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (fo_2)qi.parseFrom(byteString, extensionRegistryLite);
    }

    public static fo_2 at(byte[] byArray) {
        return (fo_2)qi.parseFrom(byArray);
    }

    public static fo_2 as(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (fo_2)qi.parseFrom(byArray, extensionRegistryLite);
    }

    public static fo_2 bK(InputStream inputStream) {
        return (fo_2)GeneratedMessageV3.parseWithIOException(qi, (InputStream)inputStream);
    }

    public static fo_2 bK(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fo_2)GeneratedMessageV3.parseWithIOException(qi, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fo_2 bL(InputStream inputStream) {
        return (fo_2)GeneratedMessageV3.parseDelimitedWithIOException(qi, (InputStream)inputStream);
    }

    public static fo_2 bL(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fo_2)GeneratedMessageV3.parseDelimitedWithIOException(qi, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fo_2 as(CodedInputStream codedInputStream) {
        return (fo_2)GeneratedMessageV3.parseWithIOException(qi, (CodedInputStream)codedInputStream);
    }

    public static fo_2 dc(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fo_2)GeneratedMessageV3.parseWithIOException(qi, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public fq_1 zB() {
        return fo_2.zC();
    }

    public static fq_1 zC() {
        return qh.zD();
    }

    public static fq_1 a(fo_2 fo_22) {
        return qh.zD().c(fo_22);
    }

    public fq_1 zD() {
        return this == qh ? new fq_1() : new fq_1().c(this);
    }

    protected fq_1 as(GeneratedMessageV3.BuilderParent builderParent) {
        fq_1 fq_12 = new fq_1(builderParent);
        return fq_12;
    }

    public static fo_2 zE() {
        return qh;
    }

    public static Parser<fo_2> z() {
        return qi;
    }

    public Parser<fo_2> getParserForType() {
        return qi;
    }

    public fo_2 zF() {
        return qh;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.as(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.zD();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.zB();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.zD();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.zB();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.zF();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.zF();
    }

    static /* synthetic */ boolean Y() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean gG() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(fo_2 fo_22) {
        return fo_22.unknownFields;
    }
}

