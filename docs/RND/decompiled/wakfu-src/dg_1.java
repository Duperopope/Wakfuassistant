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
 *  com.google.protobuf.Internal
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
import com.google.protobuf.Internal;
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
 * Renamed from dg
 */
public final class dg_1
extends GeneratedMessageV3
implements dy_2 {
    private static final long jR = 0L;
    int an;
    public static final int jS = 1;
    long jT;
    public static final int jU = 2;
    dj_2 jV;
    public static final int jW = 3;
    List<di_2> jX;
    private byte Y = (byte)-1;
    private static final dg_1 jY = new dg_1();
    @Deprecated
    public static final Parser<dg_1> jZ = new dh_1();

    dg_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private dg_1() {
        this.jX = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new dg_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    dg_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block13;
                    }
                    case 8: {
                        this.an |= 1;
                        this.jT = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 18: {
                        dl_1 dl_12 = null;
                        if ((this.an & 2) != 0) {
                            dl_12 = this.jV.pQ();
                        }
                        this.jV = (dj_2)codedInputStream.readMessage(dj_2.km, extensionRegistryLite);
                        if (dl_12 != null) {
                            dl_12.e(this.jV);
                            this.jV = dl_12.pX();
                        }
                        this.an |= 2;
                        continue block13;
                    }
                    case 26: {
                        if ((n & 4) == 0) {
                            this.jX = new ArrayList<di_2>();
                            n |= 4;
                        }
                        this.jX.add((di_2)codedInputStream.readMessage(di_2.le, extensionRegistryLite));
                        continue block13;
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
            if ((n & 4) != 0) {
                this.jX = Collections.unmodifiableList(this.jX);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor pd() {
        return df_2.jx;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return df_2.jy.ensureFieldAccessorsInitialized(dg_1.class, di_1.class);
    }

    @Override
    public boolean pe() {
        return (this.an & 1) != 0;
    }

    @Override
    public long pf() {
        return this.jT;
    }

    @Override
    public boolean pg() {
        return (this.an & 2) != 0;
    }

    @Override
    public dj_2 ph() {
        return this.jV == null ? dj_2.pR() : this.jV;
    }

    @Override
    public dm_2 pi() {
        return this.jV == null ? dj_2.pR() : this.jV;
    }

    @Override
    public List<di_2> pj() {
        return this.jX;
    }

    @Override
    public List<? extends dl_2> pk() {
        return this.jX;
    }

    @Override
    public int pl() {
        return this.jX.size();
    }

    @Override
    public di_2 aq(int n) {
        return this.jX.get(n);
    }

    @Override
    public dl_2 ar(int n) {
        return this.jX.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.pe()) {
            this.Y = 0;
            return false;
        }
        if (!this.pg()) {
            this.Y = 0;
            return false;
        }
        for (int i = 0; i < this.pl(); ++i) {
            if (this.aq(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.jT);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeMessage(2, (MessageLite)this.ph());
        }
        for (int i = 0; i < this.jX.size(); ++i) {
            codedOutputStream.writeMessage(3, (MessageLite)this.jX.get(i));
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.jT);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.ph());
        }
        for (int i = 0; i < this.jX.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.jX.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dg_1)) {
            return super.equals(object);
        }
        dg_1 dg_12 = (dg_1)object;
        if (this.pe() != dg_12.pe()) {
            return false;
        }
        if (this.pe() && this.pf() != dg_12.pf()) {
            return false;
        }
        if (this.pg() != dg_12.pg()) {
            return false;
        }
        if (this.pg() && !this.ph().equals(dg_12.ph())) {
            return false;
        }
        if (!this.pj().equals(dg_12.pj())) {
            return false;
        }
        return this.unknownFields.equals((Object)dg_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + dg_1.pd().hashCode();
        if (this.pe()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.pf());
        }
        if (this.pg()) {
            n = 37 * n + 2;
            n = 53 * n + this.ph().hashCode();
        }
        if (this.pl() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.pj().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static dg_1 V(ByteBuffer byteBuffer) {
        return (dg_1)jZ.parseFrom(byteBuffer);
    }

    public static dg_1 V(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (dg_1)jZ.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static dg_1 aD(ByteString byteString) {
        return (dg_1)jZ.parseFrom(byteString);
    }

    public static dg_1 V(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (dg_1)jZ.parseFrom(byteString, extensionRegistryLite);
    }

    public static dg_1 V(byte[] byArray) {
        return (dg_1)jZ.parseFrom(byArray);
    }

    public static dg_1 V(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (dg_1)jZ.parseFrom(byArray, extensionRegistryLite);
    }

    public static dg_1 aQ(InputStream inputStream) {
        return (dg_1)GeneratedMessageV3.parseWithIOException(jZ, (InputStream)inputStream);
    }

    public static dg_1 aQ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dg_1)GeneratedMessageV3.parseWithIOException(jZ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dg_1 aR(InputStream inputStream) {
        return (dg_1)GeneratedMessageV3.parseDelimitedWithIOException(jZ, (InputStream)inputStream);
    }

    public static dg_1 aR(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dg_1)GeneratedMessageV3.parseDelimitedWithIOException(jZ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dg_1 V(CodedInputStream codedInputStream) {
        return (dg_1)GeneratedMessageV3.parseWithIOException(jZ, (CodedInputStream)codedInputStream);
    }

    public static dg_1 bL(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dg_1)GeneratedMessageV3.parseWithIOException(jZ, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public di_1 pm() {
        return dg_1.pn();
    }

    public static di_1 pn() {
        return jY.po();
    }

    public static di_1 a(dg_1 dg_12) {
        return jY.po().c(dg_12);
    }

    public di_1 po() {
        return this == jY ? new di_1() : new di_1().c(this);
    }

    protected di_1 V(GeneratedMessageV3.BuilderParent builderParent) {
        di_1 di_12 = new di_1(builderParent);
        return di_12;
    }

    public static dg_1 pp() {
        return jY;
    }

    public static Parser<dg_1> z() {
        return jZ;
    }

    public Parser<dg_1> getParserForType() {
        return jZ;
    }

    public dg_1 pq() {
        return jY;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.V(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.po();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.pm();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.po();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.pm();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.pq();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.pq();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(dg_1 dg_12) {
        return dg_12.unknownFields;
    }
}

