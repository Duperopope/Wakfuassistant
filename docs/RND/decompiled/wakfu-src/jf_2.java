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
 * Renamed from jF
 */
public final class jf_2
extends GeneratedMessageV3
implements ji_2 {
    private static final long CM = 0L;
    public static final int CN = 1;
    List<jc_2> jj;
    private byte Y = (byte)-1;
    private static final jf_2 CO = new jf_2();
    @Deprecated
    public static final Parser<jf_2> CP = new jg_2();

    jf_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jf_2() {
        this.jj = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new jf_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jf_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.jj = new ArrayList<jc_2>();
                            bl |= true;
                        }
                        this.jj.add((jc_2)codedInputStream.readMessage(jc_2.CL, extensionRegistryLite));
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

    public static final Descriptors.Descriptor WB() {
        return jb_2.CG;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jb_2.CH.ensureFieldAccessorsInitialized(jf_2.class, jh_2.class);
    }

    @Override
    public List<jc_2> ot() {
        return this.jj;
    }

    @Override
    public List<? extends jj_2> ou() {
        return this.jj;
    }

    @Override
    public int ov() {
        return this.jj.size();
    }

    @Override
    public jc_2 fF(int n) {
        return this.jj.get(n);
    }

    @Override
    public jj_2 fG(int n) {
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
            if (this.fF(i).isInitialized()) continue;
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
        if (!(object instanceof jf_2)) {
            return super.equals(object);
        }
        jf_2 jf_22 = (jf_2)object;
        if (!this.ot().equals(jf_22.ot())) {
            return false;
        }
        return this.unknownFields.equals((Object)jf_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jf_2.WB().hashCode();
        if (this.ov() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.ot().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jf_2 bt(ByteBuffer byteBuffer) {
        return (jf_2)CP.parseFrom(byteBuffer);
    }

    public static jf_2 bp(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jf_2)CP.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jf_2 cm(ByteString byteString) {
        return (jf_2)CP.parseFrom(byteString);
    }

    public static jf_2 bp(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jf_2)CP.parseFrom(byteString, extensionRegistryLite);
    }

    public static jf_2 bq(byte[] byArray) {
        return (jf_2)CP.parseFrom(byArray);
    }

    public static jf_2 bp(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jf_2)CP.parseFrom(byArray, extensionRegistryLite);
    }

    public static jf_2 dE(InputStream inputStream) {
        return (jf_2)GeneratedMessageV3.parseWithIOException(CP, (InputStream)inputStream);
    }

    public static jf_2 dE(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jf_2)GeneratedMessageV3.parseWithIOException(CP, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jf_2 dF(InputStream inputStream) {
        return (jf_2)GeneratedMessageV3.parseDelimitedWithIOException(CP, (InputStream)inputStream);
    }

    public static jf_2 dF(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jf_2)GeneratedMessageV3.parseDelimitedWithIOException(CP, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jf_2 bp(CodedInputStream codedInputStream) {
        return (jf_2)GeneratedMessageV3.parseWithIOException(CP, (CodedInputStream)codedInputStream);
    }

    public static jf_2 fT(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jf_2)GeneratedMessageV3.parseWithIOException(CP, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public jh_2 WC() {
        return jf_2.WD();
    }

    public static jh_2 WD() {
        return CO.WE();
    }

    public static jh_2 a(jf_2 jf_22) {
        return CO.WE().c(jf_22);
    }

    public jh_2 WE() {
        return this == CO ? new jh_2() : new jh_2().c(this);
    }

    protected jh_2 bp(GeneratedMessageV3.BuilderParent builderParent) {
        jh_2 jh_22 = new jh_2(builderParent);
        return jh_22;
    }

    public static jf_2 WF() {
        return CO;
    }

    public static Parser<jf_2> z() {
        return CP;
    }

    public Parser<jf_2> getParserForType() {
        return CP;
    }

    public jf_2 WG() {
        return CO;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bp(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.WE();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.WC();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.WE();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.WC();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.WG();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.WG();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(jf_2 jf_22) {
        return jf_22.unknownFields;
    }
}

