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
 * Renamed from lC
 */
public final class lc_0
extends GeneratedMessageV3
implements ln_1 {
    private static final long ID = 0L;
    int an;
    public static final int IE = 1;
    List<lj_0> IF;
    public static final int IG = 2;
    List<lF> IH;
    public static final int II = 3;
    int IJ;
    public static final int IK = 4;
    int IL;
    public static final int IM = 9;
    int IN;
    private byte Y = (byte)-1;
    private static final lc_0 IO = new lc_0();
    @Deprecated
    public static final Parser<lc_0> IP = new lD();

    lc_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private lc_0() {
        this.IF = Collections.emptyList();
        this.IH = Collections.emptyList();
        this.IN = -1;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new lc_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    lc_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block15: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block15;
                    }
                    case 10: {
                        if ((n & 1) == 0) {
                            this.IF = new ArrayList<lj_0>();
                            n |= 1;
                        }
                        this.IF.add((lj_0)codedInputStream.readMessage(lj_0.Jh, extensionRegistryLite));
                        continue block15;
                    }
                    case 18: {
                        if ((n & 2) == 0) {
                            this.IH = new ArrayList<lF>();
                            n |= 2;
                        }
                        this.IH.add((lF)codedInputStream.readMessage(lF.IX, extensionRegistryLite));
                        continue block15;
                    }
                    case 24: {
                        this.an |= 1;
                        this.IJ = codedInputStream.readInt32();
                        continue block15;
                    }
                    case 32: {
                        this.an |= 2;
                        this.IL = codedInputStream.readInt32();
                        continue block15;
                    }
                    case 72: {
                        this.an |= 4;
                        this.IN = codedInputStream.readInt32();
                        continue block15;
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
            if (n & true) {
                this.IF = Collections.unmodifiableList(this.IF);
            }
            if ((n & 2) != 0) {
                this.IH = Collections.unmodifiableList(this.IH);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor ahq() {
        return kF.FU;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.FV.ensureFieldAccessorsInitialized(lc_0.class, le_0.class);
    }

    @Override
    public List<lj_0> ahr() {
        return this.IF;
    }

    @Override
    public List<? extends lm_1> ahs() {
        return this.IF;
    }

    @Override
    public int aht() {
        return this.IF.size();
    }

    @Override
    public lj_0 hr(int n) {
        return this.IF.get(n);
    }

    @Override
    public lm_1 hs(int n) {
        return this.IF.get(n);
    }

    @Override
    public List<lF> ahu() {
        return this.IH;
    }

    @Override
    public List<? extends li_0> ahv() {
        return this.IH;
    }

    @Override
    public int ahw() {
        return this.IH.size();
    }

    @Override
    public lF ht(int n) {
        return this.IH.get(n);
    }

    @Override
    public li_0 hu(int n) {
        return this.IH.get(n);
    }

    @Override
    public boolean ahx() {
        return (this.an & 1) != 0;
    }

    @Override
    public int ahy() {
        return this.IJ;
    }

    @Override
    public boolean ahz() {
        return (this.an & 2) != 0;
    }

    @Override
    public int ahA() {
        return this.IL;
    }

    @Override
    public boolean ahB() {
        return (this.an & 4) != 0;
    }

    @Override
    public int ahC() {
        return this.IN;
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
        for (n = 0; n < this.aht(); ++n) {
            if (this.hr(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        for (n = 0; n < this.ahw(); ++n) {
            if (this.ht(n).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        for (n = 0; n < this.IF.size(); ++n) {
            codedOutputStream.writeMessage(1, (MessageLite)this.IF.get(n));
        }
        for (n = 0; n < this.IH.size(); ++n) {
            codedOutputStream.writeMessage(2, (MessageLite)this.IH.get(n));
        }
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(3, this.IJ);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(4, this.IL);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(9, this.IN);
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
        for (n = 0; n < this.IF.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.IF.get(n)));
        }
        for (n = 0; n < this.IH.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.IH.get(n)));
        }
        if ((this.an & 1) != 0) {
            n2 += CodedOutputStream.computeInt32Size((int)3, (int)this.IJ);
        }
        if ((this.an & 2) != 0) {
            n2 += CodedOutputStream.computeInt32Size((int)4, (int)this.IL);
        }
        if ((this.an & 4) != 0) {
            n2 += CodedOutputStream.computeInt32Size((int)9, (int)this.IN);
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof lc_0)) {
            return super.equals(object);
        }
        lc_0 lc_02 = (lc_0)object;
        if (!this.ahr().equals(lc_02.ahr())) {
            return false;
        }
        if (!this.ahu().equals(lc_02.ahu())) {
            return false;
        }
        if (this.ahx() != lc_02.ahx()) {
            return false;
        }
        if (this.ahx() && this.ahy() != lc_02.ahy()) {
            return false;
        }
        if (this.ahz() != lc_02.ahz()) {
            return false;
        }
        if (this.ahz() && this.ahA() != lc_02.ahA()) {
            return false;
        }
        if (this.ahB() != lc_02.ahB()) {
            return false;
        }
        if (this.ahB() && this.ahC() != lc_02.ahC()) {
            return false;
        }
        return this.unknownFields.equals((Object)lc_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + lc_0.ahq().hashCode();
        if (this.aht() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.ahr().hashCode();
        }
        if (this.ahw() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.ahu().hashCode();
        }
        if (this.ahx()) {
            n = 37 * n + 3;
            n = 53 * n + this.ahy();
        }
        if (this.ahz()) {
            n = 37 * n + 4;
            n = 53 * n + this.ahA();
        }
        if (this.ahB()) {
            n = 37 * n + 9;
            n = 53 * n + this.ahC();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static lc_0 bR(ByteBuffer byteBuffer) {
        return (lc_0)IP.parseFrom(byteBuffer);
    }

    public static lc_0 bN(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (lc_0)IP.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static lc_0 cX(ByteString byteString) {
        return (lc_0)IP.parseFrom(byteString);
    }

    public static lc_0 bN(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (lc_0)IP.parseFrom(byteString, extensionRegistryLite);
    }

    public static lc_0 bO(byte[] byArray) {
        return (lc_0)IP.parseFrom(byArray);
    }

    public static lc_0 bN(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (lc_0)IP.parseFrom(byArray, extensionRegistryLite);
    }

    public static lc_0 eA(InputStream inputStream) {
        return (lc_0)GeneratedMessageV3.parseWithIOException(IP, (InputStream)inputStream);
    }

    public static lc_0 eA(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lc_0)GeneratedMessageV3.parseWithIOException(IP, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lc_0 eB(InputStream inputStream) {
        return (lc_0)GeneratedMessageV3.parseDelimitedWithIOException(IP, (InputStream)inputStream);
    }

    public static lc_0 eB(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lc_0)GeneratedMessageV3.parseDelimitedWithIOException(IP, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lc_0 bN(CodedInputStream codedInputStream) {
        return (lc_0)GeneratedMessageV3.parseWithIOException(IP, (CodedInputStream)codedInputStream);
    }

    public static lc_0 hn(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lc_0)GeneratedMessageV3.parseWithIOException(IP, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public le_0 ahD() {
        return lc_0.ahE();
    }

    public static le_0 ahE() {
        return IO.ahF();
    }

    public static le_0 c(lc_0 lc_02) {
        return IO.ahF().e(lc_02);
    }

    public le_0 ahF() {
        return this == IO ? new le_0() : new le_0().e(this);
    }

    protected le_0 bN(GeneratedMessageV3.BuilderParent builderParent) {
        le_0 le_02 = new le_0(builderParent);
        return le_02;
    }

    public static lc_0 ahG() {
        return IO;
    }

    public static Parser<lc_0> z() {
        return IP;
    }

    public Parser<lc_0> getParserForType() {
        return IP;
    }

    public lc_0 ahH() {
        return IO;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bN(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.ahF();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.ahD();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.ahF();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.ahD();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ahH();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ahH();
    }

    static /* synthetic */ boolean gG() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean B() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean jh() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(lc_0 lc_02) {
        return lc_02.unknownFields;
    }
}

