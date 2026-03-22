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

public final class ea
extends GeneratedMessageV3
implements ed {
    private static final long mm = 0L;
    int an;
    public static final int mn = 3;
    int mj;
    public static final int mo = 4;
    List<dW> mp;
    private byte Y = (byte)-1;
    private static final ea mq = new ea();
    @Deprecated
    public static final Parser<ea> mr = new eb();

    ea(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ea() {
        this.mp = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ea();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ea(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    case 24: {
                        this.an |= 1;
                        this.mj = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 34: {
                        if ((n & 2) == 0) {
                            this.mp = new ArrayList<dW>();
                            n |= 2;
                        }
                        this.mp.add((dW)codedInputStream.readMessage(dW.ml, extensionRegistryLite));
                        continue block12;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
                bl = true;
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
            if ((n & 2) != 0) {
                this.mp = Collections.unmodifiableList(this.mp);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor tY() {
        return dV.mb;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dV.mc.ensureFieldAccessorsInitialized(ea.class, ec.class);
    }

    @Override
    public boolean tK() {
        return (this.an & 1) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    @Override
    public List<dW> tZ() {
        return this.mp;
    }

    @Override
    public List<? extends dZ> ua() {
        return this.mp;
    }

    @Override
    public int ub() {
        return this.mp.size();
    }

    @Override
    public dW bh(int n) {
        return this.mp.get(n);
    }

    @Override
    public dZ bi(int n) {
        return this.mp.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.ub(); ++i) {
            if (this.bh(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(3, this.mj);
        }
        for (int i = 0; i < this.mp.size(); ++i) {
            codedOutputStream.writeMessage(4, (MessageLite)this.mp.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.mj);
        }
        for (int i = 0; i < this.mp.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)4, (MessageLite)((MessageLite)this.mp.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ea)) {
            return super.equals(object);
        }
        ea ea2 = (ea)object;
        if (this.tK() != ea2.tK()) {
            return false;
        }
        if (this.tK() && this.tL() != ea2.tL()) {
            return false;
        }
        if (!this.tZ().equals(ea2.tZ())) {
            return false;
        }
        return this.unknownFields.equals((Object)ea2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ea.tY().hashCode();
        if (this.tK()) {
            n = 37 * n + 3;
            n = 53 * n + this.tL();
        }
        if (this.ub() > 0) {
            n = 37 * n + 4;
            n = 53 * n + this.tZ().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ea af(ByteBuffer byteBuffer) {
        return (ea)mr.parseFrom(byteBuffer);
    }

    public static ea af(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ea)mr.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ea aN(ByteString byteString) {
        return (ea)mr.parseFrom(byteString);
    }

    public static ea af(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ea)mr.parseFrom(byteString, extensionRegistryLite);
    }

    public static ea af(byte[] byArray) {
        return (ea)mr.parseFrom(byArray);
    }

    public static ea af(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ea)mr.parseFrom(byArray, extensionRegistryLite);
    }

    public static ea bk(InputStream inputStream) {
        return (ea)GeneratedMessageV3.parseWithIOException(mr, (InputStream)inputStream);
    }

    public static ea bk(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ea)GeneratedMessageV3.parseWithIOException(mr, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ea bl(InputStream inputStream) {
        return (ea)GeneratedMessageV3.parseDelimitedWithIOException(mr, (InputStream)inputStream);
    }

    public static ea bl(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ea)GeneratedMessageV3.parseDelimitedWithIOException(mr, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ea af(CodedInputStream codedInputStream) {
        return (ea)GeneratedMessageV3.parseWithIOException(mr, (CodedInputStream)codedInputStream);
    }

    public static ea cp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ea)GeneratedMessageV3.parseWithIOException(mr, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ec uc() {
        return ea.ud();
    }

    public static ec ud() {
        return mq.ue();
    }

    public static ec a(ea ea2) {
        return mq.ue().c(ea2);
    }

    public ec ue() {
        return this == mq ? new ec() : new ec().c(this);
    }

    protected ec af(GeneratedMessageV3.BuilderParent builderParent) {
        ec ec2 = new ec(builderParent);
        return ec2;
    }

    public static ea uf() {
        return mq;
    }

    public static Parser<ea> z() {
        return mr;
    }

    public Parser<ea> getParserForType() {
        return mr;
    }

    public ea ug() {
        return mq;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.af(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.ue();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.uc();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.ue();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.uc();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ug();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ug();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ea ea2) {
        return ea2.unknownFields;
    }
}

