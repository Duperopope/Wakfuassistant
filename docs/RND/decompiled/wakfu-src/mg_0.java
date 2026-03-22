/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.Internal$IntList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from mG
 */
public final class mg_0
extends GeneratedMessageV3.Builder<mg_0>
implements mh_0 {
    private int an;
    private long wq;
    private int qB;
    private long LE;
    private Object LG = "";
    private int LI;
    private int LK = -1;
    private long Kf;
    private int jq;
    private int Kh;
    private long Kj;
    private int LQ;
    private Internal.IntList LS = mE.Ac();
    private boolean LU;
    private int LW;
    private int LY;

    public static final Descriptors.Descriptor amZ() {
        return md_0.Ly;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return md_0.Lz.ensureFieldAccessorsInitialized(mE.class, mg_0.class);
    }

    mg_0() {
        this.D();
    }

    mg_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (mE.oV()) {
            // empty if block
        }
    }

    public mg_0 ana() {
        super.clear();
        this.wq = 0L;
        this.an &= 0xFFFFFFFE;
        this.qB = 0;
        this.an &= 0xFFFFFFFD;
        this.LE = 0L;
        this.an &= 0xFFFFFFFB;
        this.LG = "";
        this.an &= 0xFFFFFFF7;
        this.LI = 0;
        this.an &= 0xFFFFFFEF;
        this.LK = -1;
        this.an &= 0xFFFFFFDF;
        this.Kf = 0L;
        this.an &= 0xFFFFFFBF;
        this.jq = 0;
        this.an &= 0xFFFFFF7F;
        this.Kh = 0;
        this.an &= 0xFFFFFEFF;
        this.Kj = 0L;
        this.an &= 0xFFFFFDFF;
        this.LQ = 0;
        this.an &= 0xFFFFFBFF;
        this.LS = mE.amY();
        this.an &= 0xFFFFF7FF;
        this.LU = false;
        this.an &= 0xFFFFEFFF;
        this.LW = 0;
        this.an &= 0xFFFFDFFF;
        this.LY = 0;
        this.an &= 0xFFFFBFFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return md_0.Ly;
    }

    public mE amX() {
        return mE.amW();
    }

    public mE anb() {
        mE mE2 = this.anc();
        if (!mE2.isInitialized()) {
            throw mg_0.newUninitializedMessageException((Message)mE2);
        }
        return mE2;
    }

    public mE anc() {
        mE mE2 = new mE(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            mE2.wq = this.wq;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            mE2.qB = this.qB;
            n2 |= 2;
        }
        if ((n & 4) != 0) {
            mE2.LE = this.LE;
            n2 |= 4;
        }
        if ((n & 8) != 0) {
            n2 |= 8;
        }
        mE2.LG = this.LG;
        if ((n & 0x10) != 0) {
            mE2.LI = this.LI;
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            n2 |= 0x20;
        }
        mE2.LK = this.LK;
        if ((n & 0x40) != 0) {
            mE2.Kf = this.Kf;
            n2 |= 0x40;
        }
        if ((n & 0x80) != 0) {
            mE2.jq = this.jq;
            n2 |= 0x80;
        }
        if ((n & 0x100) != 0) {
            mE2.Kh = this.Kh;
            n2 |= 0x100;
        }
        if ((n & 0x200) != 0) {
            mE2.Kj = this.Kj;
            n2 |= 0x200;
        }
        if ((n & 0x400) != 0) {
            mE2.LQ = this.LQ;
            n2 |= 0x400;
        }
        if ((this.an & 0x800) != 0) {
            this.LS.makeImmutable();
            this.an &= 0xFFFFF7FF;
        }
        mE2.LS = this.LS;
        if ((n & 0x1000) != 0) {
            mE2.LU = this.LU;
            n2 |= 0x800;
        }
        if ((n & 0x2000) != 0) {
            mE2.LW = this.LW;
            n2 |= 0x1000;
        }
        if ((n & 0x4000) != 0) {
            mE2.LY = this.LY;
            n2 |= 0x2000;
        }
        mE2.an = n2;
        this.onBuilt();
        return mE2;
    }

    public mg_0 and() {
        return (mg_0)super.clone();
    }

    public mg_0 eY(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mg_0)super.setField(fieldDescriptor, object);
    }

    public mg_0 bZ(Descriptors.FieldDescriptor fieldDescriptor) {
        return (mg_0)super.clearField(fieldDescriptor);
    }

    public mg_0 bZ(Descriptors.OneofDescriptor oneofDescriptor) {
        return (mg_0)super.clearOneof(oneofDescriptor);
    }

    public mg_0 bZ(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (mg_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public mg_0 eZ(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mg_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public mg_0 bZ(Message message) {
        if (message instanceof mE) {
            return this.c((mE)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public mg_0 c(mE mE2) {
        if (mE2 == mE.amW()) {
            return this;
        }
        if (mE2.Lw()) {
            this.bn(mE2.Lx());
        }
        if (mE2.AJ()) {
            this.iq(mE2.AK());
        }
        if (mE2.amA()) {
            this.bo(mE2.amB());
        }
        if (mE2.amC()) {
            this.an |= 8;
            this.LG = mE2.LG;
            this.onChanged();
        }
        if (mE2.amF()) {
            this.ir(mE2.amG());
        }
        if (mE2.amH()) {
            this.is(mE2.amI());
        }
        if (mE2.akc()) {
            this.bp(mE2.akd());
        }
        if (mE2.oO()) {
            this.it(mE2.oP());
        }
        if (mE2.ake()) {
            this.iu(mE2.akf());
        }
        if (mE2.akg()) {
            this.bq(mE2.akh());
        }
        if (mE2.amJ()) {
            this.iv(mE2.amK());
        }
        if (!mE2.LS.isEmpty()) {
            if (this.LS.isEmpty()) {
                this.LS = mE2.LS;
                this.an &= 0xFFFFF7FF;
            } else {
                this.anp();
                this.LS.addAll((Collection)mE2.LS);
            }
            this.onChanged();
        }
        if (mE2.amN()) {
            this.S(mE2.amO());
        }
        if (mE2.amP()) {
            this.ix(mE2.amQ());
        }
        if (mE2.amR()) {
            this.iy(mE2.amS());
        }
        this.eZ(mE.b(mE2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.AJ()) {
            return false;
        }
        if (!this.amA()) {
            return false;
        }
        if (!this.amC()) {
            return false;
        }
        if (!this.akc()) {
            return false;
        }
        if (!this.oO()) {
            return false;
        }
        return this.ake();
    }

    public mg_0 hZ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mE mE2 = null;
        try {
            mE2 = (mE)mE.Ma.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mE2 = (mE)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mE2 != null) {
                this.c(mE2);
            }
        }
        return this;
    }

    @Override
    public boolean Lw() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Lx() {
        return this.wq;
    }

    public mg_0 bn(long l) {
        this.an |= 1;
        this.wq = l;
        this.onChanged();
        return this;
    }

    public mg_0 ane() {
        this.an &= 0xFFFFFFFE;
        this.wq = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean AJ() {
        return (this.an & 2) != 0;
    }

    @Override
    public int AK() {
        return this.qB;
    }

    public mg_0 iq(int n) {
        this.an |= 2;
        this.qB = n;
        this.onChanged();
        return this;
    }

    public mg_0 anf() {
        this.an &= 0xFFFFFFFD;
        this.qB = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean amA() {
        return (this.an & 4) != 0;
    }

    @Override
    public long amB() {
        return this.LE;
    }

    public mg_0 bo(long l) {
        this.an |= 4;
        this.LE = l;
        this.onChanged();
        return this;
    }

    public mg_0 ang() {
        this.an &= 0xFFFFFFFB;
        this.LE = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean amC() {
        return (this.an & 8) != 0;
    }

    @Override
    public String amD() {
        Object object = this.LG;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.LG = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString amE() {
        Object object = this.LG;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.LG = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public mg_0 V(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 8;
        this.LG = string;
        this.onChanged();
        return this;
    }

    public mg_0 anh() {
        this.an &= 0xFFFFFFF7;
        this.LG = mE.amW().amD();
        this.onChanged();
        return this;
    }

    public mg_0 do(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 8;
        this.LG = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean amF() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int amG() {
        return this.LI;
    }

    public mg_0 ir(int n) {
        this.an |= 0x10;
        this.LI = n;
        this.onChanged();
        return this;
    }

    public mg_0 ani() {
        this.an &= 0xFFFFFFEF;
        this.LI = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean amH() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public int amI() {
        return this.LK;
    }

    public mg_0 is(int n) {
        this.an |= 0x20;
        this.LK = n;
        this.onChanged();
        return this;
    }

    public mg_0 anj() {
        this.an &= 0xFFFFFFDF;
        this.LK = -1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean akc() {
        return (this.an & 0x40) != 0;
    }

    @Override
    public long akd() {
        return this.Kf;
    }

    public mg_0 bp(long l) {
        this.an |= 0x40;
        this.Kf = l;
        this.onChanged();
        return this;
    }

    public mg_0 ank() {
        this.an &= 0xFFFFFFBF;
        this.Kf = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean oO() {
        return (this.an & 0x80) != 0;
    }

    @Override
    public int oP() {
        return this.jq;
    }

    public mg_0 it(int n) {
        this.an |= 0x80;
        this.jq = n;
        this.onChanged();
        return this;
    }

    public mg_0 anl() {
        this.an &= 0xFFFFFF7F;
        this.jq = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ake() {
        return (this.an & 0x100) != 0;
    }

    @Override
    public int akf() {
        return this.Kh;
    }

    public mg_0 iu(int n) {
        this.an |= 0x100;
        this.Kh = n;
        this.onChanged();
        return this;
    }

    public mg_0 anm() {
        this.an &= 0xFFFFFEFF;
        this.Kh = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean akg() {
        return (this.an & 0x200) != 0;
    }

    @Override
    public long akh() {
        return this.Kj;
    }

    public mg_0 bq(long l) {
        this.an |= 0x200;
        this.Kj = l;
        this.onChanged();
        return this;
    }

    public mg_0 ann() {
        this.an &= 0xFFFFFDFF;
        this.Kj = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean amJ() {
        return (this.an & 0x400) != 0;
    }

    @Override
    public int amK() {
        return this.LQ;
    }

    public mg_0 iv(int n) {
        this.an |= 0x400;
        this.LQ = n;
        this.onChanged();
        return this;
    }

    public mg_0 ano() {
        this.an &= 0xFFFFFBFF;
        this.LQ = 0;
        this.onChanged();
        return this;
    }

    private void anp() {
        if ((this.an & 0x800) == 0) {
            this.LS = mE.b(this.LS);
            this.an |= 0x800;
        }
    }

    @Override
    public List<Integer> amL() {
        return (this.an & 0x800) != 0 ? Collections.unmodifiableList(this.LS) : this.LS;
    }

    @Override
    public int amM() {
        return this.LS.size();
    }

    @Override
    public int ip(int n) {
        return this.LS.getInt(n);
    }

    public mg_0 f(int n, int n2) {
        this.anp();
        this.LS.setInt(n, n2);
        this.onChanged();
        return this;
    }

    public mg_0 iw(int n) {
        this.anp();
        this.LS.addInt(n);
        this.onChanged();
        return this;
    }

    public mg_0 ag(Iterable<? extends Integer> iterable) {
        this.anp();
        AbstractMessageLite.Builder.addAll(iterable, (List)this.LS);
        this.onChanged();
        return this;
    }

    public mg_0 anq() {
        this.LS = mE.Ad();
        this.an &= 0xFFFFF7FF;
        this.onChanged();
        return this;
    }

    @Override
    public boolean amN() {
        return (this.an & 0x1000) != 0;
    }

    @Override
    public boolean amO() {
        return this.LU;
    }

    public mg_0 S(boolean bl) {
        this.an |= 0x1000;
        this.LU = bl;
        this.onChanged();
        return this;
    }

    public mg_0 anr() {
        this.an &= 0xFFFFEFFF;
        this.LU = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean amP() {
        return (this.an & 0x2000) != 0;
    }

    @Override
    public int amQ() {
        return this.LW;
    }

    public mg_0 ix(int n) {
        this.an |= 0x2000;
        this.LW = n;
        this.onChanged();
        return this;
    }

    public mg_0 ans() {
        this.an &= 0xFFFFDFFF;
        this.LW = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean amR() {
        return (this.an & 0x4000) != 0;
    }

    @Override
    public int amS() {
        return this.LY;
    }

    public mg_0 iy(int n) {
        this.an |= 0x4000;
        this.LY = n;
        this.onChanged();
        return this;
    }

    public mg_0 ant() {
        this.an &= 0xFFFFBFFF;
        this.LY = 0;
        this.onChanged();
        return this;
    }

    public final mg_0 eY(UnknownFieldSet unknownFieldSet) {
        return (mg_0)super.setUnknownFields(unknownFieldSet);
    }

    public final mg_0 eZ(UnknownFieldSet unknownFieldSet) {
        return (mg_0)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eZ(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eY(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eZ(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bZ(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bZ(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bZ(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eY(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.ana();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.and();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eZ(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hZ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.bZ(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.ana();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bZ(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.and();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eZ(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.eY(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eZ(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.bZ(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.bZ(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.bZ(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.eY(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hZ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.and();
    }

    public /* synthetic */ Message buildPartial() {
        return this.anc();
    }

    public /* synthetic */ Message build() {
        return this.anb();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.bZ(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ana();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hZ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.and();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.anc();
    }

    public /* synthetic */ MessageLite build() {
        return this.anb();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ana();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.amX();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.amX();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.hZ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.and();
    }

    public /* synthetic */ Object clone() {
        return this.and();
    }
}

