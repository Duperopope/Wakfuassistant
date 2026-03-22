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
 * Renamed from mI
 */
public final class mi_0
extends GeneratedMessageV3
implements ml_0 {
    private static final long Mb = 0L;
    int an;
    public static final int Mc = 1;
    mk Kp;
    public static final int Md = 2;
    List<mE> Me;
    public static final int Mf = 3;
    long Ks;
    private byte Y = (byte)-1;
    private static final mi_0 Mg = new mi_0();
    @Deprecated
    public static final Parser<mi_0> Mh = new mJ();

    mi_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mi_0() {
        this.Me = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new mi_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mi_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 10: {
                        mm_0 mm_02 = null;
                        if ((this.an & 1) != 0) {
                            mm_02 = this.Kp.ald();
                        }
                        this.Kp = (mk)codedInputStream.readMessage(mk.KC, extensionRegistryLite);
                        if (mm_02 != null) {
                            mm_02.e(this.Kp);
                            this.Kp = mm_02.alj();
                        }
                        this.an |= 1;
                        continue block13;
                    }
                    case 18: {
                        if ((n & 2) == 0) {
                            this.Me = new ArrayList<mE>();
                            n |= 2;
                        }
                        this.Me.add((mE)codedInputStream.readMessage(mE.Ma, extensionRegistryLite));
                        continue block13;
                    }
                    case 24: {
                        this.an |= 2;
                        this.Ks = codedInputStream.readInt64();
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
            if ((n & 2) != 0) {
                this.Me = Collections.unmodifiableList(this.Me);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor anu() {
        return md_0.Lw;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return md_0.Lx.ensureFieldAccessorsInitialized(mi_0.class, mk_0.class);
    }

    @Override
    public boolean akD() {
        return (this.an & 1) != 0;
    }

    @Override
    public mk akE() {
        return this.Kp == null ? mk.ale() : this.Kp;
    }

    @Override
    public mn akF() {
        return this.Kp == null ? mk.ale() : this.Kp;
    }

    @Override
    public List<mE> anv() {
        return this.Me;
    }

    @Override
    public List<? extends mh_0> anw() {
        return this.Me;
    }

    @Override
    public int anx() {
        return this.Me.size();
    }

    @Override
    public mE iz(int n) {
        return this.Me.get(n);
    }

    @Override
    public mh_0 iA(int n) {
        return this.Me.get(n);
    }

    @Override
    public boolean akG() {
        return (this.an & 2) != 0;
    }

    @Override
    public long akH() {
        return this.Ks;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.akD()) {
            this.Y = 0;
            return false;
        }
        if (!this.akG()) {
            this.Y = 0;
            return false;
        }
        if (!this.akE().isInitialized()) {
            this.Y = 0;
            return false;
        }
        for (int i = 0; i < this.anx(); ++i) {
            if (this.iz(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeMessage(1, (MessageLite)this.akE());
        }
        for (int i = 0; i < this.Me.size(); ++i) {
            codedOutputStream.writeMessage(2, (MessageLite)this.Me.get(i));
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(3, this.Ks);
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
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.akE());
        }
        for (int i = 0; i < this.Me.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.Me.get(i)));
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.Ks);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mi_0)) {
            return super.equals(object);
        }
        mi_0 mi_02 = (mi_0)object;
        if (this.akD() != mi_02.akD()) {
            return false;
        }
        if (this.akD() && !this.akE().equals(mi_02.akE())) {
            return false;
        }
        if (!this.anv().equals(mi_02.anv())) {
            return false;
        }
        if (this.akG() != mi_02.akG()) {
            return false;
        }
        if (this.akG() && this.akH() != mi_02.akH()) {
            return false;
        }
        return this.unknownFields.equals((Object)mi_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mi_0.anu().hashCode();
        if (this.akD()) {
            n = 37 * n + 1;
            n = 53 * n + this.akE().hashCode();
        }
        if (this.anx() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.anv().hashCode();
        }
        if (this.akG()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.akH());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mi_0 ce(ByteBuffer byteBuffer) {
        return (mi_0)Mh.parseFrom(byteBuffer);
    }

    public static mi_0 ca(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mi_0)Mh.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mi_0 dp(ByteString byteString) {
        return (mi_0)Mh.parseFrom(byteString);
    }

    public static mi_0 ca(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mi_0)Mh.parseFrom(byteString, extensionRegistryLite);
    }

    public static mi_0 cb(byte[] byArray) {
        return (mi_0)Mh.parseFrom(byArray);
    }

    public static mi_0 ca(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mi_0)Mh.parseFrom(byArray, extensionRegistryLite);
    }

    public static mi_0 fa(InputStream inputStream) {
        return (mi_0)GeneratedMessageV3.parseWithIOException(Mh, (InputStream)inputStream);
    }

    public static mi_0 fa(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mi_0)GeneratedMessageV3.parseWithIOException(Mh, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mi_0 fb(InputStream inputStream) {
        return (mi_0)GeneratedMessageV3.parseDelimitedWithIOException(Mh, (InputStream)inputStream);
    }

    public static mi_0 fb(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mi_0)GeneratedMessageV3.parseDelimitedWithIOException(Mh, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mi_0 ca(CodedInputStream codedInputStream) {
        return (mi_0)GeneratedMessageV3.parseWithIOException(Mh, (CodedInputStream)codedInputStream);
    }

    public static mi_0 ia(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mi_0)GeneratedMessageV3.parseWithIOException(Mh, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mk_0 any() {
        return mi_0.anz();
    }

    public static mk_0 anz() {
        return Mg.anA();
    }

    public static mk_0 a(mi_0 mi_02) {
        return Mg.anA().c(mi_02);
    }

    public mk_0 anA() {
        return this == Mg ? new mk_0() : new mk_0().c(this);
    }

    protected mk_0 ca(GeneratedMessageV3.BuilderParent builderParent) {
        mk_0 mk_02 = new mk_0(builderParent);
        return mk_02;
    }

    public static mi_0 anB() {
        return Mg;
    }

    public static Parser<mi_0> z() {
        return Mh;
    }

    public Parser<mi_0> getParserForType() {
        return Mh;
    }

    public mi_0 anC() {
        return Mg;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ca(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.anA();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.any();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.anA();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.any();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.anC();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.anC();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(mi_0 mi_02) {
        return mi_02.unknownFields;
    }
}

