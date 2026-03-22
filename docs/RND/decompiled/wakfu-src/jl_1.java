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
 * Renamed from jl
 */
public final class jl_1
extends GeneratedMessageV3
implements jo_1 {
    private static final long BR = 0L;
    int an;
    public static final int BS = 1;
    int BT;
    public static final int BU = 2;
    List<jd_1> BV;
    public static final int BW = 3;
    List<iz_2> BX;
    private byte Y = (byte)-1;
    private static final jl_1 BY = new jl_1();
    @Deprecated
    public static final Parser<jl_1> BZ = new jm_1();

    jl_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jl_1() {
        this.BV = Collections.emptyList();
        this.BX = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new jl_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jl_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.BT = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 18: {
                        if ((n & 2) == 0) {
                            this.BV = new ArrayList<jd_1>();
                            n |= 2;
                        }
                        this.BV.add((jd_1)codedInputStream.readMessage(jd_1.Bk, extensionRegistryLite));
                        continue block13;
                    }
                    case 26: {
                        if ((n & 4) == 0) {
                            this.BX = new ArrayList<iz_2>();
                            n |= 4;
                        }
                        this.BX.add((iz_2)codedInputStream.readMessage(iz_2.AR, extensionRegistryLite));
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
                this.BV = Collections.unmodifiableList(this.BV);
            }
            if ((n & 4) != 0) {
                this.BX = Collections.unmodifiableList(this.BX);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor UA() {
        return iu_2.Ai;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return iu_2.Aj.ensureFieldAccessorsInitialized(jl_1.class, jn_1.class);
    }

    @Override
    public boolean IR() {
        return (this.an & 1) != 0;
    }

    @Override
    public int UB() {
        return this.BT;
    }

    @Override
    public List<jd_1> UC() {
        return this.BV;
    }

    @Override
    public List<? extends jg_1> UD() {
        return this.BV;
    }

    @Override
    public int UE() {
        return this.BV.size();
    }

    @Override
    public jd_1 fk(int n) {
        return this.BV.get(n);
    }

    @Override
    public jg_1 fl(int n) {
        return this.BV.get(n);
    }

    @Override
    public List<iz_2> UF() {
        return this.BX;
    }

    @Override
    public List<? extends jc_1> UG() {
        return this.BX;
    }

    @Override
    public int UH() {
        return this.BX.size();
    }

    @Override
    public iz_2 fm(int n) {
        return this.BX.get(n);
    }

    @Override
    public jc_1 fn(int n) {
        return this.BX.get(n);
    }

    public final boolean isInitialized() {
        int n;
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.IR()) {
            this.Y = 0;
            return false;
        }
        for (n = 0; n < this.UE(); ++n) {
            if (this.fk(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        for (n = 0; n < this.UH(); ++n) {
            if (this.fm(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.BT);
        }
        for (n = 0; n < this.BV.size(); ++n) {
            codedOutputStream.writeMessage(2, (MessageLite)this.BV.get(n));
        }
        for (n = 0; n < this.BX.size(); ++n) {
            codedOutputStream.writeMessage(3, (MessageLite)this.BX.get(n));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.an & 1) != 0) {
            n2 += CodedOutputStream.computeInt32Size((int)1, (int)this.BT);
        }
        for (n = 0; n < this.BV.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.BV.get(n)));
        }
        for (n = 0; n < this.BX.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.BX.get(n)));
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof jl_1)) {
            return super.equals(object);
        }
        jl_1 jl_12 = (jl_1)object;
        if (this.IR() != jl_12.IR()) {
            return false;
        }
        if (this.IR() && this.UB() != jl_12.UB()) {
            return false;
        }
        if (!this.UC().equals(jl_12.UC())) {
            return false;
        }
        if (!this.UF().equals(jl_12.UF())) {
            return false;
        }
        return this.unknownFields.equals((Object)jl_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jl_1.UA().hashCode();
        if (this.IR()) {
            n = 37 * n + 1;
            n = 53 * n + this.UB();
        }
        if (this.UE() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.UC().hashCode();
        }
        if (this.UH() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.UF().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jl_1 bo(ByteBuffer byteBuffer) {
        return (jl_1)BZ.parseFrom(byteBuffer);
    }

    public static jl_1 bk(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jl_1)BZ.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jl_1 ch(ByteString byteString) {
        return (jl_1)BZ.parseFrom(byteString);
    }

    public static jl_1 bk(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jl_1)BZ.parseFrom(byteString, extensionRegistryLite);
    }

    public static jl_1 bl(byte[] byArray) {
        return (jl_1)BZ.parseFrom(byArray);
    }

    public static jl_1 bk(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jl_1)BZ.parseFrom(byArray, extensionRegistryLite);
    }

    public static jl_1 du(InputStream inputStream) {
        return (jl_1)GeneratedMessageV3.parseWithIOException(BZ, (InputStream)inputStream);
    }

    public static jl_1 du(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jl_1)GeneratedMessageV3.parseWithIOException(BZ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jl_1 dv(InputStream inputStream) {
        return (jl_1)GeneratedMessageV3.parseDelimitedWithIOException(BZ, (InputStream)inputStream);
    }

    public static jl_1 dv(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jl_1)GeneratedMessageV3.parseDelimitedWithIOException(BZ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jl_1 bk(CodedInputStream codedInputStream) {
        return (jl_1)GeneratedMessageV3.parseWithIOException(BZ, (CodedInputStream)codedInputStream);
    }

    public static jl_1 fE(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jl_1)GeneratedMessageV3.parseWithIOException(BZ, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public jn_1 UI() {
        return jl_1.UJ();
    }

    public static jn_1 UJ() {
        return BY.UK();
    }

    public static jn_1 e(jl_1 jl_12) {
        return BY.UK().g(jl_12);
    }

    public jn_1 UK() {
        return this == BY ? new jn_1() : new jn_1().g(this);
    }

    protected jn_1 bk(GeneratedMessageV3.BuilderParent builderParent) {
        jn_1 jn_12 = new jn_1(builderParent);
        return jn_12;
    }

    public static jl_1 UL() {
        return BY;
    }

    public static Parser<jl_1> z() {
        return BZ;
    }

    public Parser<jl_1> getParserForType() {
        return BZ;
    }

    public jl_1 UM() {
        return BY;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bk(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.UK();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.UI();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.UK();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.UI();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.UM();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.UM();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean bg() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet f(jl_1 jl_12) {
        return jl_12.unknownFields;
    }
}

