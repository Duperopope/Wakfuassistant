/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class nt
extends GeneratedMessageV3.Builder<nt>
implements nu {
    private int an;
    private long AH;
    private Object bs = "";
    private Object DP = "";
    private Object DR = "";
    private int mj;
    private long DM;
    private List<nz> Ed = Collections.emptyList();
    private RepeatedFieldBuilderV3<nz, nb_0, nc_0> Ek;
    private List<nv> Ef = Collections.emptyList();
    private RepeatedFieldBuilderV3<nv, nx, ny> El;

    public static final Descriptors.Descriptor apQ() {
        return nq.Nt;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nq.Nu.ensureFieldAccessorsInitialized(nr.class, nt.class);
    }

    nt() {
        this.D();
    }

    nt(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (nr.aJ()) {
            this.YY();
            this.Zd();
        }
    }

    public nt apR() {
        super.clear();
        this.AH = 0L;
        this.an &= 0xFFFFFFFE;
        this.bs = "";
        this.an &= 0xFFFFFFFD;
        this.DP = "";
        this.an &= 0xFFFFFFFB;
        this.DR = "";
        this.an &= 0xFFFFFFF7;
        this.mj = 0;
        this.an &= 0xFFFFFFEF;
        this.DM = 0L;
        this.an &= 0xFFFFFFDF;
        if (this.Ek == null) {
            this.Ed = Collections.emptyList();
            this.an &= 0xFFFFFFBF;
        } else {
            this.Ek.clear();
        }
        if (this.El == null) {
            this.Ef = Collections.emptyList();
            this.an &= 0xFFFFFF7F;
        } else {
            this.El.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return nq.Nt;
    }

    public nr apP() {
        return nr.apO();
    }

    public nr apS() {
        nr nr2 = this.apT();
        if (!nr2.isInitialized()) {
            throw nt.newUninitializedMessageException((Message)nr2);
        }
        return nr2;
    }

    public nr apT() {
        nr nr2 = new nr(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            nr2.AH = this.AH;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            n2 |= 2;
        }
        nr2.bs = this.bs;
        if ((n & 4) != 0) {
            n2 |= 4;
        }
        nr2.DP = this.DP;
        if ((n & 8) != 0) {
            n2 |= 8;
        }
        nr2.DR = this.DR;
        if ((n & 0x10) != 0) {
            nr2.mj = this.mj;
            n2 |= 0x10;
        }
        if ((n & 0x20) != 0) {
            nr2.DM = this.DM;
            n2 |= 0x20;
        }
        if (this.Ek == null) {
            if ((this.an & 0x40) != 0) {
                this.Ed = Collections.unmodifiableList(this.Ed);
                this.an &= 0xFFFFFFBF;
            }
            nr2.Ed = this.Ed;
        } else {
            nr2.Ed = this.Ek.build();
        }
        if (this.El == null) {
            if ((this.an & 0x80) != 0) {
                this.Ef = Collections.unmodifiableList(this.Ef);
                this.an &= 0xFFFFFF7F;
            }
            nr2.Ef = this.Ef;
        } else {
            nr2.Ef = this.El.build();
        }
        nr2.an = n2;
        this.onBuilt();
        return nr2;
    }

    public nt apU() {
        return (nt)super.clone();
    }

    public nt fk(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nt)super.setField(fieldDescriptor, object);
    }

    public nt cf(Descriptors.FieldDescriptor fieldDescriptor) {
        return (nt)super.clearField(fieldDescriptor);
    }

    public nt cf(Descriptors.OneofDescriptor oneofDescriptor) {
        return (nt)super.clearOneof(oneofDescriptor);
    }

    public nt cf(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (nt)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public nt fl(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nt)super.addRepeatedField(fieldDescriptor, object);
    }

    public nt cf(Message message) {
        if (message instanceof nr) {
            return this.c((nr)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public nt c(nr nr2) {
        if (nr2 == nr.apO()) {
            return this;
        }
        if (nr2.oN()) {
            this.bz(nr2.Sn());
        }
        if (nr2.wq()) {
            this.an |= 2;
            this.bs = nr2.bs;
            this.onChanged();
        }
        if (nr2.Yd()) {
            this.an |= 4;
            this.DP = nr2.DP;
            this.onChanged();
        }
        if (nr2.Q()) {
            this.an |= 8;
            this.DR = nr2.DR;
            this.onChanged();
        }
        if (nr2.tK()) {
            this.jf(nr2.tL());
        }
        if (nr2.Yb()) {
            this.bA(nr2.Yc());
        }
        if (this.Ek == null) {
            if (!nr2.Ed.isEmpty()) {
                if (this.Ed.isEmpty()) {
                    this.Ed = nr2.Ed;
                    this.an &= 0xFFFFFFBF;
                } else {
                    this.YU();
                    this.Ed.addAll(nr2.Ed);
                }
                this.onChanged();
            }
        } else if (!nr2.Ed.isEmpty()) {
            if (this.Ek.isEmpty()) {
                this.Ek.dispose();
                this.Ek = null;
                this.Ed = nr2.Ed;
                this.an &= 0xFFFFFFBF;
                this.Ek = nr.oB() ? this.YY() : null;
            } else {
                this.Ek.addAllMessages(nr2.Ed);
            }
        }
        if (this.El == null) {
            if (!nr2.Ef.isEmpty()) {
                if (this.Ef.isEmpty()) {
                    this.Ef = nr2.Ef;
                    this.an &= 0xFFFFFF7F;
                } else {
                    this.YZ();
                    this.Ef.addAll(nr2.Ef);
                }
                this.onChanged();
            }
        } else if (!nr2.Ef.isEmpty()) {
            if (this.El.isEmpty()) {
                this.El.dispose();
                this.El = null;
                this.Ef = nr2.Ef;
                this.an &= 0xFFFFFF7F;
                this.El = nr.fa() ? this.Zd() : null;
            } else {
                this.El.addAllMessages(nr2.Ef);
            }
        }
        this.fl(nr.b(nr2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int n;
        if (!this.oN()) {
            return false;
        }
        if (!this.wq()) {
            return false;
        }
        if (!this.Yd()) {
            return false;
        }
        if (!this.Q()) {
            return false;
        }
        if (!this.tK()) {
            return false;
        }
        if (!this.Yb()) {
            return false;
        }
        for (n = 0; n < this.Ys(); ++n) {
            if (this.jb(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.Yv(); ++n) {
            if (this.jd(n).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public nt ir(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        nr nr2 = null;
        try {
            nr2 = (nr)nr.NJ.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            nr2 = (nr)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (nr2 != null) {
                this.c(nr2);
            }
        }
        return this;
    }

    @Override
    public boolean oN() {
        return (this.an & 1) != 0;
    }

    @Override
    public long Sn() {
        return this.AH;
    }

    public nt bz(long l) {
        this.an |= 1;
        this.AH = l;
        this.onChanged();
        return this;
    }

    public nt apV() {
        this.an &= 0xFFFFFFFE;
        this.AH = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean wq() {
        return (this.an & 2) != 0;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.bs = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString bW() {
        Object object = this.bs;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bs = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nt W(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.bs = string;
        this.onChanged();
        return this;
    }

    public nt apW() {
        this.an &= 0xFFFFFFFD;
        this.bs = nr.apO().getName();
        this.onChanged();
        return this;
    }

    public nt dv(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 2;
        this.bs = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Yd() {
        return (this.an & 4) != 0;
    }

    @Override
    public String getDescription() {
        Object object = this.DP;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.DP = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString Ye() {
        Object object = this.DP;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.DP = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nt X(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 4;
        this.DP = string;
        this.onChanged();
        return this;
    }

    public nt apX() {
        this.an &= 0xFFFFFFFB;
        this.DP = nr.apO().getDescription();
        this.onChanged();
        return this;
    }

    public nt dw(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 4;
        this.DP = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Q() {
        return (this.an & 8) != 0;
    }

    @Override
    public String getMessage() {
        Object object = this.DR;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.DR = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString Yf() {
        Object object = this.DR;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.DR = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nt Y(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 8;
        this.DR = string;
        this.onChanged();
        return this;
    }

    public nt apY() {
        this.an &= 0xFFFFFFF7;
        this.DR = nr.apO().getMessage();
        this.onChanged();
        return this;
    }

    public nt dx(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 8;
        this.DR = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean tK() {
        return (this.an & 0x10) != 0;
    }

    @Override
    public int tL() {
        return this.mj;
    }

    public nt jf(int n) {
        this.an |= 0x10;
        this.mj = n;
        this.onChanged();
        return this;
    }

    public nt apZ() {
        this.an &= 0xFFFFFFEF;
        this.mj = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Yb() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public long Yc() {
        return this.DM;
    }

    public nt bA(long l) {
        this.an |= 0x20;
        this.DM = l;
        this.onChanged();
        return this;
    }

    public nt aqa() {
        this.an &= 0xFFFFFFDF;
        this.DM = 0L;
        this.onChanged();
        return this;
    }

    private void YU() {
        if ((this.an & 0x40) == 0) {
            this.Ed = new ArrayList<nz>(this.Ed);
            this.an |= 0x40;
        }
    }

    @Override
    public List<nz> Yq() {
        if (this.Ek == null) {
            return Collections.unmodifiableList(this.Ed);
        }
        return this.Ek.getMessageList();
    }

    @Override
    public int Ys() {
        if (this.Ek == null) {
            return this.Ed.size();
        }
        return this.Ek.getCount();
    }

    @Override
    public nz jb(int n) {
        if (this.Ek == null) {
            return this.Ed.get(n);
        }
        return (nz)this.Ek.getMessage(n);
    }

    public nt a(int n, nz nz2) {
        if (this.Ek == null) {
            if (nz2 == null) {
                throw new NullPointerException();
            }
            this.YU();
            this.Ed.set(n, nz2);
            this.onChanged();
        } else {
            this.Ek.setMessage(n, (AbstractMessage)nz2);
        }
        return this;
    }

    public nt a(int n, nb_0 nb_02) {
        if (this.Ek == null) {
            this.YU();
            this.Ed.set(n, nb_02.aqF());
            this.onChanged();
        } else {
            this.Ek.setMessage(n, (AbstractMessage)nb_02.aqF());
        }
        return this;
    }

    public nt a(nz nz2) {
        if (this.Ek == null) {
            if (nz2 == null) {
                throw new NullPointerException();
            }
            this.YU();
            this.Ed.add(nz2);
            this.onChanged();
        } else {
            this.Ek.addMessage((AbstractMessage)nz2);
        }
        return this;
    }

    public nt b(int n, nz nz2) {
        if (this.Ek == null) {
            if (nz2 == null) {
                throw new NullPointerException();
            }
            this.YU();
            this.Ed.add(n, nz2);
            this.onChanged();
        } else {
            this.Ek.addMessage(n, (AbstractMessage)nz2);
        }
        return this;
    }

    public nt a(nb_0 nb_02) {
        if (this.Ek == null) {
            this.YU();
            this.Ed.add(nb_02.aqF());
            this.onChanged();
        } else {
            this.Ek.addMessage((AbstractMessage)nb_02.aqF());
        }
        return this;
    }

    public nt b(int n, nb_0 nb_02) {
        if (this.Ek == null) {
            this.YU();
            this.Ed.add(n, nb_02.aqF());
            this.onChanged();
        } else {
            this.Ek.addMessage(n, (AbstractMessage)nb_02.aqF());
        }
        return this;
    }

    public nt al(Iterable<? extends nz> iterable) {
        if (this.Ek == null) {
            this.YU();
            AbstractMessageLite.Builder.addAll(iterable, this.Ed);
            this.onChanged();
        } else {
            this.Ek.addAllMessages(iterable);
        }
        return this;
    }

    public nt aqb() {
        if (this.Ek == null) {
            this.Ed = Collections.emptyList();
            this.an &= 0xFFFFFFBF;
            this.onChanged();
        } else {
            this.Ek.clear();
        }
        return this;
    }

    public nt jg(int n) {
        if (this.Ek == null) {
            this.YU();
            this.Ed.remove(n);
            this.onChanged();
        } else {
            this.Ek.remove(n);
        }
        return this;
    }

    public nb_0 jh(int n) {
        return (nb_0)this.YY().getBuilder(n);
    }

    @Override
    public nc_0 jc(int n) {
        if (this.Ek == null) {
            return this.Ed.get(n);
        }
        return (nc_0)this.Ek.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends nc_0> Yr() {
        if (this.Ek != null) {
            return this.Ek.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.Ed);
    }

    public nb_0 aqc() {
        return (nb_0)this.YY().addBuilder((AbstractMessage)nz.aqB());
    }

    public nb_0 ji(int n) {
        return (nb_0)this.YY().addBuilder(n, (AbstractMessage)nz.aqB());
    }

    public List<nb_0> YX() {
        return this.YY().getBuilderList();
    }

    private RepeatedFieldBuilderV3<nz, nb_0, nc_0> YY() {
        if (this.Ek == null) {
            this.Ek = new RepeatedFieldBuilderV3(this.Ed, (this.an & 0x40) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Ed = null;
        }
        return this.Ek;
    }

    private void YZ() {
        if ((this.an & 0x80) == 0) {
            this.Ef = new ArrayList<nv>(this.Ef);
            this.an |= 0x80;
        }
    }

    @Override
    public List<nv> Yt() {
        if (this.El == null) {
            return Collections.unmodifiableList(this.Ef);
        }
        return this.El.getMessageList();
    }

    @Override
    public int Yv() {
        if (this.El == null) {
            return this.Ef.size();
        }
        return this.El.getCount();
    }

    @Override
    public nv jd(int n) {
        if (this.El == null) {
            return this.Ef.get(n);
        }
        return (nv)this.El.getMessage(n);
    }

    public nt a(int n, nv nv2) {
        if (this.El == null) {
            if (nv2 == null) {
                throw new NullPointerException();
            }
            this.YZ();
            this.Ef.set(n, nv2);
            this.onChanged();
        } else {
            this.El.setMessage(n, (AbstractMessage)nv2);
        }
        return this;
    }

    public nt a(int n, nx nx2) {
        if (this.El == null) {
            this.YZ();
            this.Ef.set(n, nx2.aqp());
            this.onChanged();
        } else {
            this.El.setMessage(n, (AbstractMessage)nx2.aqp());
        }
        return this;
    }

    public nt a(nv nv2) {
        if (this.El == null) {
            if (nv2 == null) {
                throw new NullPointerException();
            }
            this.YZ();
            this.Ef.add(nv2);
            this.onChanged();
        } else {
            this.El.addMessage((AbstractMessage)nv2);
        }
        return this;
    }

    public nt b(int n, nv nv2) {
        if (this.El == null) {
            if (nv2 == null) {
                throw new NullPointerException();
            }
            this.YZ();
            this.Ef.add(n, nv2);
            this.onChanged();
        } else {
            this.El.addMessage(n, (AbstractMessage)nv2);
        }
        return this;
    }

    public nt a(nx nx2) {
        if (this.El == null) {
            this.YZ();
            this.Ef.add(nx2.aqp());
            this.onChanged();
        } else {
            this.El.addMessage((AbstractMessage)nx2.aqp());
        }
        return this;
    }

    public nt b(int n, nx nx2) {
        if (this.El == null) {
            this.YZ();
            this.Ef.add(n, nx2.aqp());
            this.onChanged();
        } else {
            this.El.addMessage(n, (AbstractMessage)nx2.aqp());
        }
        return this;
    }

    public nt am(Iterable<? extends nv> iterable) {
        if (this.El == null) {
            this.YZ();
            AbstractMessageLite.Builder.addAll(iterable, this.Ef);
            this.onChanged();
        } else {
            this.El.addAllMessages(iterable);
        }
        return this;
    }

    public nt aqd() {
        if (this.El == null) {
            this.Ef = Collections.emptyList();
            this.an &= 0xFFFFFF7F;
            this.onChanged();
        } else {
            this.El.clear();
        }
        return this;
    }

    public nt jj(int n) {
        if (this.El == null) {
            this.YZ();
            this.Ef.remove(n);
            this.onChanged();
        } else {
            this.El.remove(n);
        }
        return this;
    }

    public nx jk(int n) {
        return (nx)this.Zd().getBuilder(n);
    }

    @Override
    public ny je(int n) {
        if (this.El == null) {
            return this.Ef.get(n);
        }
        return (ny)this.El.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends ny> Yu() {
        if (this.El != null) {
            return this.El.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.Ef);
    }

    public nx aqe() {
        return (nx)this.Zd().addBuilder((AbstractMessage)nv.aql());
    }

    public nx jl(int n) {
        return (nx)this.Zd().addBuilder(n, (AbstractMessage)nv.aql());
    }

    public List<nx> Zc() {
        return this.Zd().getBuilderList();
    }

    private RepeatedFieldBuilderV3<nv, nx, ny> Zd() {
        if (this.El == null) {
            this.El = new RepeatedFieldBuilderV3(this.Ef, (this.an & 0x80) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.Ef = null;
        }
        return this.El;
    }

    public final nt fk(UnknownFieldSet unknownFieldSet) {
        return (nt)super.setUnknownFields(unknownFieldSet);
    }

    public final nt fl(UnknownFieldSet unknownFieldSet) {
        return (nt)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fl(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fk(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fl(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cf(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cf(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cf(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fk(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.apR();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.apU();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fl(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ir(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cf(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.apR();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cf(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.apU();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fl(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fk(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fl(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cf(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cf(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cf(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fk(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ir(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.apU();
    }

    public /* synthetic */ Message buildPartial() {
        return this.apT();
    }

    public /* synthetic */ Message build() {
        return this.apS();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cf(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.apR();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ir(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.apU();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.apT();
    }

    public /* synthetic */ MessageLite build() {
        return this.apS();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.apR();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.apP();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.apP();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ir(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.apU();
    }

    public /* synthetic */ Object clone() {
        return this.apU();
    }
}

