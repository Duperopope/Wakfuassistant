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

public final class kW
extends GeneratedMessageV3
implements lh {
    private static final long GX = 0L;
    int an;
    public static final int GY = 1;
    long wX;
    public static final int GZ = 2;
    int Gx;
    public static final int Ha = 3;
    int Fe;
    public static final int Hb = 50;
    ly_1 Hc;
    public static final int Hd = 51;
    lq_1 He;
    public static final int Hf = 52;
    lc_0 Hg;
    public static final int Hh = 54;
    kS Hi;
    public static final int Hj = 55;
    kZ Hk;
    public static final int Hl = 56;
    ld_0 Hm;
    public static final int Hn = 57;
    lu_1 Ho;
    public static final int Hp = 58;
    int Hq;
    private byte Y = (byte)-1;
    private static final kW Hr = new kW();
    @Deprecated
    public static final Parser<kW> Hs = new kX();

    kW(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private kW() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new kW();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    kW(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block21: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block21;
                    }
                    case 8: {
                        this.an |= 1;
                        this.wX = codedInputStream.readInt64();
                        continue block21;
                    }
                    case 16: {
                        this.an |= 2;
                        this.Gx = codedInputStream.readInt32();
                        continue block21;
                    }
                    case 24: {
                        this.an |= 4;
                        this.Fe = codedInputStream.readInt32();
                        continue block21;
                    }
                    case 402: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.an & 8) != 0) {
                            builder2 = this.Hc.agY();
                        }
                        this.Hc = (ly_1)codedInputStream.readMessage(ly_1.IC, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.e(this.Hc);
                            this.Hc = builder2.ahe();
                        }
                        this.an |= 8;
                        continue block21;
                    }
                    case 410: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.an & 0x10) != 0) {
                            builder2 = this.He.agk();
                        }
                        this.He = (lq_1)codedInputStream.readMessage(lq_1.Id, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.e(this.He);
                            this.He = builder2.agq();
                        }
                        this.an |= 0x10;
                        continue block21;
                    }
                    case 418: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.an & 0x20) != 0) {
                            builder2 = this.Hg.ahF();
                        }
                        this.Hg = (lc_0)codedInputStream.readMessage(lc_0.IP, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.e(this.Hg);
                            this.Hg = builder2.ahL();
                        }
                        this.an |= 0x20;
                        continue block21;
                    }
                    case 434: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.an & 0x40) != 0) {
                            builder2 = this.Hi.adE();
                        }
                        this.Hi = (kS)codedInputStream.readMessage(kS.GW, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.c(this.Hi);
                            this.Hi = builder2.adK();
                        }
                        this.an |= 0x40;
                        continue block21;
                    }
                    case 442: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.an & 0x80) != 0) {
                            builder2 = this.Hk.afa();
                        }
                        this.Hk = (kZ)codedInputStream.readMessage(kZ.HG, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.e(this.Hk);
                            this.Hk = builder2.afg();
                        }
                        this.an |= 0x80;
                        continue block21;
                    }
                    case 450: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.an & 0x100) != 0) {
                            builder2 = this.Hm.afr();
                        }
                        this.Hm = (ld_0)codedInputStream.readMessage(ld_0.HN, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.e(this.Hm);
                            this.Hm = builder2.afy();
                        }
                        this.an |= 0x100;
                        continue block21;
                    }
                    case 458: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.an & 0x200) != 0) {
                            builder2 = this.Ho.agx();
                        }
                        this.Ho = (lu_1)codedInputStream.readMessage(lu_1.Ih, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.e(this.Ho);
                            this.Ho = builder2.agD();
                        }
                        this.an |= 0x200;
                        continue block21;
                    }
                    case 464: {
                        this.an |= 0x400;
                        this.Hq = codedInputStream.readInt32();
                        continue block21;
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
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor adN() {
        return kF.FO;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.FP.ensureFieldAccessorsInitialized(kW.class, kY.class);
    }

    @Override
    public boolean LU() {
        return (this.an & 1) != 0;
    }

    @Override
    public long LV() {
        return this.wX;
    }

    @Override
    public boolean acr() {
        return (this.an & 2) != 0;
    }

    @Override
    public int acs() {
        return this.Gx;
    }

    @Override
    public boolean aaC() {
        return (this.an & 4) != 0;
    }

    @Override
    public int aaD() {
        return this.Fe;
    }

    @Override
    public boolean adO() {
        return (this.an & 8) != 0;
    }

    @Override
    public ly_1 adP() {
        return this.Hc == null ? ly_1.agZ() : this.Hc;
    }

    @Override
    public lB adQ() {
        return this.Hc == null ? ly_1.agZ() : this.Hc;
    }

    @Override
    public boolean pe() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public lq_1 adR() {
        return this.He == null ? lq_1.agl() : this.He;
    }

    @Override
    public lt_0 adS() {
        return this.He == null ? lq_1.agl() : this.He;
    }

    @Override
    public boolean adT() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public lc_0 adU() {
        return this.Hg == null ? lc_0.ahG() : this.Hg;
    }

    @Override
    public ln_1 adV() {
        return this.Hg == null ? lc_0.ahG() : this.Hg;
    }

    @Override
    public boolean adW() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public kS adX() {
        return this.Hi == null ? kS.adF() : this.Hi;
    }

    @Override
    public kV adY() {
        return this.Hi == null ? kS.adF() : this.Hi;
    }

    @Override
    public boolean adZ() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public kZ aea() {
        return this.Hk == null ? kZ.afb() : this.Hk;
    }

    @Override
    public lc aeb() {
        return this.Hk == null ? kZ.afb() : this.Hk;
    }

    @Override
    public boolean aec() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public ld_0 aed() {
        return this.Hm == null ? ld_0.afs() : this.Hm;
    }

    @Override
    public lg_0 aee() {
        return this.Hm == null ? ld_0.afs() : this.Hm;
    }

    @Override
    public boolean aef() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public lu_1 aeg() {
        return this.Ho == null ? lu_1.agy() : this.Ho;
    }

    @Override
    public lx_1 aeh() {
        return this.Ho == null ? lu_1.agy() : this.Ho;
    }

    @Override
    public boolean aei() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public int aej() {
        return this.Hq;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.LU()) {
            this.Y = 0;
            return false;
        }
        if (!this.acr()) {
            this.Y = 0;
            return false;
        }
        if (!this.aaC()) {
            this.Y = 0;
            return false;
        }
        if (this.adO() && !this.adP().isInitialized()) {
            this.Y = 0;
            return false;
        }
        if (this.pe() && !this.adR().isInitialized()) {
            this.Y = 0;
            return false;
        }
        if (this.adT() && !this.adU().isInitialized()) {
            this.Y = 0;
            return false;
        }
        if (this.adW() && !this.adX().isInitialized()) {
            this.Y = 0;
            return false;
        }
        if (this.adZ() && !this.aea().isInitialized()) {
            this.Y = 0;
            return false;
        }
        if (this.aec() && !this.aed().isInitialized()) {
            this.Y = 0;
            return false;
        }
        if (this.aef() && !this.aeg().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt64(1, this.wX);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.Gx);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt32(3, this.Fe);
        }
        if ((this.an & 8) != 0) {
            codedOutputStream.writeMessage(50, (MessageLite)this.adP());
        }
        if ((this.an & 0x10) != 0) {
            codedOutputStream.writeMessage(51, (MessageLite)this.adR());
        }
        if ((this.an & 0x20) != 0) {
            codedOutputStream.writeMessage(52, (MessageLite)this.adU());
        }
        if ((this.an & 0x40) != 0) {
            codedOutputStream.writeMessage(54, (MessageLite)this.adX());
        }
        if ((this.an & 0x80) != 0) {
            codedOutputStream.writeMessage(55, (MessageLite)this.aea());
        }
        if ((this.an & 0x100) != 0) {
            codedOutputStream.writeMessage(56, (MessageLite)this.aed());
        }
        if ((this.an & 0x200) != 0) {
            codedOutputStream.writeMessage(57, (MessageLite)this.aeg());
        }
        if ((this.an & 0x400) != 0) {
            codedOutputStream.writeInt32(58, this.Hq);
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
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.wX);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.Gx);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.Fe);
        }
        if ((this.an & 8) != 0) {
            n += CodedOutputStream.computeMessageSize((int)50, (MessageLite)this.adP());
        }
        if ((this.an & 0x10) != 0) {
            n += CodedOutputStream.computeMessageSize((int)51, (MessageLite)this.adR());
        }
        if ((this.an & 0x20) != 0) {
            n += CodedOutputStream.computeMessageSize((int)52, (MessageLite)this.adU());
        }
        if ((this.an & 0x40) != 0) {
            n += CodedOutputStream.computeMessageSize((int)54, (MessageLite)this.adX());
        }
        if ((this.an & 0x80) != 0) {
            n += CodedOutputStream.computeMessageSize((int)55, (MessageLite)this.aea());
        }
        if ((this.an & 0x100) != 0) {
            n += CodedOutputStream.computeMessageSize((int)56, (MessageLite)this.aed());
        }
        if ((this.an & 0x200) != 0) {
            n += CodedOutputStream.computeMessageSize((int)57, (MessageLite)this.aeg());
        }
        if ((this.an & 0x400) != 0) {
            n += CodedOutputStream.computeInt32Size((int)58, (int)this.Hq);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof kW)) {
            return super.equals(object);
        }
        kW kW2 = (kW)object;
        if (this.LU() != kW2.LU()) {
            return false;
        }
        if (this.LU() && this.LV() != kW2.LV()) {
            return false;
        }
        if (this.acr() != kW2.acr()) {
            return false;
        }
        if (this.acr() && this.acs() != kW2.acs()) {
            return false;
        }
        if (this.aaC() != kW2.aaC()) {
            return false;
        }
        if (this.aaC() && this.aaD() != kW2.aaD()) {
            return false;
        }
        if (this.adO() != kW2.adO()) {
            return false;
        }
        if (this.adO() && !this.adP().equals(kW2.adP())) {
            return false;
        }
        if (this.pe() != kW2.pe()) {
            return false;
        }
        if (this.pe() && !this.adR().equals(kW2.adR())) {
            return false;
        }
        if (this.adT() != kW2.adT()) {
            return false;
        }
        if (this.adT() && !this.adU().equals(kW2.adU())) {
            return false;
        }
        if (this.adW() != kW2.adW()) {
            return false;
        }
        if (this.adW() && !this.adX().equals(kW2.adX())) {
            return false;
        }
        if (this.adZ() != kW2.adZ()) {
            return false;
        }
        if (this.adZ() && !this.aea().equals(kW2.aea())) {
            return false;
        }
        if (this.aec() != kW2.aec()) {
            return false;
        }
        if (this.aec() && !this.aed().equals(kW2.aed())) {
            return false;
        }
        if (this.aef() != kW2.aef()) {
            return false;
        }
        if (this.aef() && !this.aeg().equals(kW2.aeg())) {
            return false;
        }
        if (this.aei() != kW2.aei()) {
            return false;
        }
        if (this.aei() && this.aej() != kW2.aej()) {
            return false;
        }
        return this.unknownFields.equals((Object)kW2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + kW.adN().hashCode();
        if (this.LU()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.LV());
        }
        if (this.acr()) {
            n = 37 * n + 2;
            n = 53 * n + this.acs();
        }
        if (this.aaC()) {
            n = 37 * n + 3;
            n = 53 * n + this.aaD();
        }
        if (this.adO()) {
            n = 37 * n + 50;
            n = 53 * n + this.adP().hashCode();
        }
        if (this.pe()) {
            n = 37 * n + 51;
            n = 53 * n + this.adR().hashCode();
        }
        if (this.adT()) {
            n = 37 * n + 52;
            n = 53 * n + this.adU().hashCode();
        }
        if (this.adW()) {
            n = 37 * n + 54;
            n = 53 * n + this.adX().hashCode();
        }
        if (this.adZ()) {
            n = 37 * n + 55;
            n = 53 * n + this.aea().hashCode();
        }
        if (this.aec()) {
            n = 37 * n + 56;
            n = 53 * n + this.aed().hashCode();
        }
        if (this.aef()) {
            n = 37 * n + 57;
            n = 53 * n + this.aeg().hashCode();
        }
        if (this.aei()) {
            n = 37 * n + 58;
            n = 53 * n + this.aej();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static kW bJ(ByteBuffer byteBuffer) {
        return (kW)Hs.parseFrom(byteBuffer);
    }

    public static kW bF(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (kW)Hs.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static kW cO(ByteString byteString) {
        return (kW)Hs.parseFrom(byteString);
    }

    public static kW bF(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (kW)Hs.parseFrom(byteString, extensionRegistryLite);
    }

    public static kW bG(byte[] byArray) {
        return (kW)Hs.parseFrom(byArray);
    }

    public static kW bF(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (kW)Hs.parseFrom(byArray, extensionRegistryLite);
    }

    public static kW ek(InputStream inputStream) {
        return (kW)GeneratedMessageV3.parseWithIOException(Hs, (InputStream)inputStream);
    }

    public static kW ek(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kW)GeneratedMessageV3.parseWithIOException(Hs, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kW el(InputStream inputStream) {
        return (kW)GeneratedMessageV3.parseDelimitedWithIOException(Hs, (InputStream)inputStream);
    }

    public static kW el(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kW)GeneratedMessageV3.parseDelimitedWithIOException(Hs, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kW bF(CodedInputStream codedInputStream) {
        return (kW)GeneratedMessageV3.parseWithIOException(Hs, (CodedInputStream)codedInputStream);
    }

    public static kW gP(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kW)GeneratedMessageV3.parseWithIOException(Hs, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public kY aek() {
        return kW.ael();
    }

    public static kY ael() {
        return Hr.aem();
    }

    public static kY f(kW kW2) {
        return Hr.aem().h(kW2);
    }

    public kY aem() {
        return this == Hr ? new kY() : new kY().h(this);
    }

    protected kY bF(GeneratedMessageV3.BuilderParent builderParent) {
        kY kY2 = new kY(builderParent);
        return kY2;
    }

    public static kW aen() {
        return Hr;
    }

    public static Parser<kW> z() {
        return Hs;
    }

    public Parser<kW> getParserForType() {
        return Hs;
    }

    public kW aeo() {
        return Hr;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bF(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aem();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aek();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aem();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aek();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aeo();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aeo();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet g(kW kW2) {
        return kW2.unknownFields;
    }
}

