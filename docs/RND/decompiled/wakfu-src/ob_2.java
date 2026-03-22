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
 * Renamed from ob
 */
public final class ob_2
extends GeneratedMessageV3
implements oe_2 {
    private static final long Qi = 0L;
    public static final int Qj = 1;
    List<ny_2> Qk;
    private byte Y = (byte)-1;
    private static final ob_2 Ql = new ob_2();
    @Deprecated
    public static final Parser<ob_2> Qm = new oc_2();

    ob_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ob_2() {
        this.Qk = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ob_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ob_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.Qk = new ArrayList<ny_2>();
                            bl |= true;
                        }
                        this.Qk.add((ny_2)codedInputStream.readMessage(ny_2.Qf, extensionRegistryLite));
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
                this.Qk = Collections.unmodifiableList(this.Qk);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor auk() {
        return nx_2.PG;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nx_2.PH.ensureFieldAccessorsInitialized(ob_2.class, od_2.class);
    }

    @Override
    public List<ny_2> aul() {
        return this.Qk;
    }

    @Override
    public List<? extends of_2> aum() {
        return this.Qk;
    }

    @Override
    public int aun() {
        return this.Qk.size();
    }

    @Override
    public ny_2 jH(int n) {
        return this.Qk.get(n);
    }

    @Override
    public of_2 jI(int n) {
        return this.Qk.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.aun(); ++i) {
            if (this.jH(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.Qk.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.Qk.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.Qk.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.Qk.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ob_2)) {
            return super.equals(object);
        }
        ob_2 ob_22 = (ob_2)object;
        if (!this.aul().equals(ob_22.aul())) {
            return false;
        }
        return this.unknownFields.equals((Object)ob_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ob_2.auk().hashCode();
        if (this.aun() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.aul().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ob_2 cr(ByteBuffer byteBuffer) {
        return (ob_2)Qm.parseFrom(byteBuffer);
    }

    public static ob_2 cn(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ob_2)Qm.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ob_2 dO(ByteString byteString) {
        return (ob_2)Qm.parseFrom(byteString);
    }

    public static ob_2 cn(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ob_2)Qm.parseFrom(byteString, extensionRegistryLite);
    }

    public static ob_2 cp(byte[] byArray) {
        return (ob_2)Qm.parseFrom(byArray);
    }

    public static ob_2 cn(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ob_2)Qm.parseFrom(byArray, extensionRegistryLite);
    }

    public static ob_2 fA(InputStream inputStream) {
        return (ob_2)GeneratedMessageV3.parseWithIOException(Qm, (InputStream)inputStream);
    }

    public static ob_2 fA(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ob_2)GeneratedMessageV3.parseWithIOException(Qm, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ob_2 fB(InputStream inputStream) {
        return (ob_2)GeneratedMessageV3.parseDelimitedWithIOException(Qm, (InputStream)inputStream);
    }

    public static ob_2 fB(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ob_2)GeneratedMessageV3.parseDelimitedWithIOException(Qm, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ob_2 cn(CodedInputStream codedInputStream) {
        return (ob_2)GeneratedMessageV3.parseWithIOException(Qm, (CodedInputStream)codedInputStream);
    }

    public static ob_2 iN(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ob_2)GeneratedMessageV3.parseWithIOException(Qm, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public od_2 auo() {
        return ob_2.aup();
    }

    public static od_2 aup() {
        return Ql.auq();
    }

    public static od_2 a(ob_2 ob_22) {
        return Ql.auq().c(ob_22);
    }

    public od_2 auq() {
        return this == Ql ? new od_2() : new od_2().c(this);
    }

    protected od_2 cn(GeneratedMessageV3.BuilderParent builderParent) {
        od_2 od_22 = new od_2(builderParent);
        return od_22;
    }

    public static ob_2 aur() {
        return Ql;
    }

    public static Parser<ob_2> z() {
        return Qm;
    }

    public Parser<ob_2> getParserForType() {
        return Qm;
    }

    public ob_2 aus() {
        return Ql;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cn(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.auq();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.auo();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.auq();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.auo();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aus();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aus();
    }

    static /* synthetic */ boolean ju() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean Y() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ob_2 ob_22) {
        return ob_22.unknownFields;
    }
}

