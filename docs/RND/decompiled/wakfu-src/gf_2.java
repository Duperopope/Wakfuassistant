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
 * Renamed from gf
 */
public final class gf_2
extends GeneratedMessageV3
implements gi_1 {
    private static final long rQ = 0L;
    int an;
    public static final int rR = 1;
    int mj;
    public static final int rS = 2;
    List<di_2> jX;
    private byte Y = (byte)-1;
    private static final gf_2 rT = new gf_2();
    @Deprecated
    public static final Parser<gf_2> rU = new gg_1();

    gf_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private gf_2() {
        this.jX = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new gf_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    gf_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 8: {
                        this.an |= 1;
                        this.mj = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 18: {
                        if ((n & 2) == 0) {
                            this.jX = new ArrayList<di_2>();
                            n |= 2;
                        }
                        this.jX.add((di_2)codedInputStream.readMessage(di_2.le, extensionRegistryLite));
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
                this.jX = Collections.unmodifiableList(this.jX);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor Dm() {
        return ge_2.rO;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ge_2.rP.ensureFieldAccessorsInitialized(gf_2.class, gh_1.class);
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
        if (!this.tK()) {
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
            codedOutputStream.writeInt32(1, this.mj);
        }
        for (int i = 0; i < this.jX.size(); ++i) {
            codedOutputStream.writeMessage(2, (MessageLite)this.jX.get(i));
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.mj);
        }
        for (int i = 0; i < this.jX.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.jX.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof gf_2)) {
            return super.equals(object);
        }
        gf_2 gf_22 = (gf_2)object;
        if (this.tK() != gf_22.tK()) {
            return false;
        }
        if (this.tK() && this.tL() != gf_22.tL()) {
            return false;
        }
        if (!this.pj().equals(gf_22.pj())) {
            return false;
        }
        return this.unknownFields.equals((Object)gf_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + gf_2.Dm().hashCode();
        if (this.tK()) {
            n = 37 * n + 1;
            n = 53 * n + this.tL();
        }
        if (this.pl() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.pj().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static gf_2 aD(ByteBuffer byteBuffer) {
        return (gf_2)rU.parseFrom(byteBuffer);
    }

    public static gf_2 aB(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (gf_2)rU.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static gf_2 bu(ByteString byteString) {
        return (gf_2)rU.parseFrom(byteString);
    }

    public static gf_2 aB(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (gf_2)rU.parseFrom(byteString, extensionRegistryLite);
    }

    public static gf_2 aC(byte[] byArray) {
        return (gf_2)rU.parseFrom(byArray);
    }

    public static gf_2 aB(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (gf_2)rU.parseFrom(byArray, extensionRegistryLite);
    }

    public static gf_2 cc(InputStream inputStream) {
        return (gf_2)GeneratedMessageV3.parseWithIOException(rU, (InputStream)inputStream);
    }

    public static gf_2 cc(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gf_2)GeneratedMessageV3.parseWithIOException(rU, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gf_2 cd(InputStream inputStream) {
        return (gf_2)GeneratedMessageV3.parseDelimitedWithIOException(rU, (InputStream)inputStream);
    }

    public static gf_2 cd(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gf_2)GeneratedMessageV3.parseDelimitedWithIOException(rU, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static gf_2 aB(CodedInputStream codedInputStream) {
        return (gf_2)GeneratedMessageV3.parseWithIOException(rU, (CodedInputStream)codedInputStream);
    }

    public static gf_2 dD(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (gf_2)GeneratedMessageV3.parseWithIOException(rU, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public gh_1 Dn() {
        return gf_2.Do();
    }

    public static gh_1 Do() {
        return rT.Dp();
    }

    public static gh_1 a(gf_2 gf_22) {
        return rT.Dp().c(gf_22);
    }

    public gh_1 Dp() {
        return this == rT ? new gh_1() : new gh_1().c(this);
    }

    protected gh_1 aB(GeneratedMessageV3.BuilderParent builderParent) {
        gh_1 gh_12 = new gh_1(builderParent);
        return gh_12;
    }

    public static gf_2 Dq() {
        return rT;
    }

    public static Parser<gf_2> z() {
        return rU;
    }

    public Parser<gf_2> getParserForType() {
        return rU;
    }

    public gf_2 Dr() {
        return rT;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aB(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Dp();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Dn();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Dp();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Dn();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Dr();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Dr();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(gf_2 gf_22) {
        return gf_22.unknownFields;
    }
}

