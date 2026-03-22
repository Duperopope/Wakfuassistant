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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class AU
extends GeneratedMessageV3.Builder<AU>
implements AV {
    private int an;
    private long apU;
    private af_0 arE;
    private SingleFieldBuilderV3<af_0, AH, AI> arN;
    private List<aj_0> arG = Collections.emptyList();
    private RepeatedFieldBuilderV3<aj_0, AL, AM> arO;
    private long wf;
    private List<Ab> arJ = Collections.emptyList();
    private RepeatedFieldBuilderV3<Ab, Ad, Ae> arP;
    private Object aqa = "";

    public static final Descriptors.Descriptor aFq() {
        return zS.apx;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zS.apy.ensureFieldAccessorsInitialized(AS.class, AU.class);
    }

    AU() {
        this.D();
    }

    AU(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (AS.BA()) {
            this.aFy();
            this.aFD();
            this.aFJ();
        }
    }

    public AU aFr() {
        super.clear();
        this.apU = 0L;
        this.an &= 0xFFFFFFFE;
        if (this.arN == null) {
            this.arE = null;
        } else {
            this.arN.clear();
        }
        this.an &= 0xFFFFFFFD;
        if (this.arO == null) {
            this.arG = Collections.emptyList();
            this.an &= 0xFFFFFFFB;
        } else {
            this.arO.clear();
        }
        this.wf = 0L;
        this.an &= 0xFFFFFFF7;
        if (this.arP == null) {
            this.arJ = Collections.emptyList();
            this.an &= 0xFFFFFFEF;
        } else {
            this.arP.clear();
        }
        this.aqa = "";
        this.an &= 0xFFFFFFDF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return zS.apx;
    }

    public AS aFo() {
        return AS.aFn();
    }

    public AS aFs() {
        AS aS = this.aFt();
        if (!aS.isInitialized()) {
            throw AU.newUninitializedMessageException((Message)aS);
        }
        return aS;
    }

    public AS aFt() {
        AS aS = new AS(this);
        int n = this.an;
        int n2 = 0;
        if ((n & 1) != 0) {
            aS.apU = this.apU;
            n2 |= 1;
        }
        if ((n & 2) != 0) {
            aS.arE = this.arN == null ? this.arE : (af_0)this.arN.build();
            n2 |= 2;
        }
        if (this.arO == null) {
            if ((this.an & 4) != 0) {
                this.arG = Collections.unmodifiableList(this.arG);
                this.an &= 0xFFFFFFFB;
            }
            aS.arG = this.arG;
        } else {
            aS.arG = this.arO.build();
        }
        if ((n & 8) != 0) {
            aS.wf = this.wf;
            n2 |= 4;
        }
        if (this.arP == null) {
            if ((this.an & 0x10) != 0) {
                this.arJ = Collections.unmodifiableList(this.arJ);
                this.an &= 0xFFFFFFEF;
            }
            aS.arJ = this.arJ;
        } else {
            aS.arJ = this.arP.build();
        }
        if ((n & 0x20) != 0) {
            n2 |= 8;
        }
        aS.aqa = this.aqa;
        aS.an = n2;
        this.onBuilt();
        return aS;
    }

    public AU aFu() {
        return (AU)super.clone();
    }

    public AU gG(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (AU)super.setField(fieldDescriptor, object);
    }

    public AU cQ(Descriptors.FieldDescriptor fieldDescriptor) {
        return (AU)super.clearField(fieldDescriptor);
    }

    public AU cQ(Descriptors.OneofDescriptor oneofDescriptor) {
        return (AU)super.clearOneof(oneofDescriptor);
    }

    public AU cQ(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (AU)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public AU gH(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (AU)super.addRepeatedField(fieldDescriptor, object);
    }

    public AU cQ(Message message) {
        if (message instanceof AS) {
            return this.h((AS)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public AU h(AS aS) {
        if (aS == AS.aFn()) {
            return this;
        }
        if (aS.aBC()) {
            this.ci(aS.aBD());
        }
        if (aS.Yd()) {
            this.e(aS.aFc());
        }
        if (this.arO == null) {
            if (!aS.arG.isEmpty()) {
                if (this.arG.isEmpty()) {
                    this.arG = aS.arG;
                    this.an &= 0xFFFFFFFB;
                } else {
                    this.aFz();
                    this.arG.addAll(aS.arG);
                }
                this.onChanged();
            }
        } else if (!aS.arG.isEmpty()) {
            if (this.arO.isEmpty()) {
                this.arO.dispose();
                this.arO = null;
                this.arG = aS.arG;
                this.an &= 0xFFFFFFFB;
                this.arO = AS.fK() ? this.aFD() : null;
            } else {
                this.arO.addAllMessages(aS.arG);
            }
        }
        if (aS.KT()) {
            this.cj(aS.KU());
        }
        if (this.arP == null) {
            if (!aS.arJ.isEmpty()) {
                if (this.arJ.isEmpty()) {
                    this.arJ = aS.arJ;
                    this.an &= 0xFFFFFFEF;
                } else {
                    this.aFF();
                    this.arJ.addAll(aS.arJ);
                }
                this.onChanged();
            }
        } else if (!aS.arJ.isEmpty()) {
            if (this.arP.isEmpty()) {
                this.arP.dispose();
                this.arP = null;
                this.arJ = aS.arJ;
                this.an &= 0xFFFFFFEF;
                this.arP = AS.aFp() ? this.aFJ() : null;
            } else {
                this.arP.addAllMessages(aS.arJ);
            }
        }
        if (aS.aBG()) {
            this.an |= 0x20;
            this.aqa = aS.aqa;
            this.onChanged();
        }
        this.gH(AS.g(aS));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int n;
        if (!this.Yd()) {
            return false;
        }
        if (!this.aFc().isInitialized()) {
            return false;
        }
        for (n = 0; n < this.aFg(); ++n) {
            if (this.lx(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.aFj(); ++n) {
            if (this.lz(n).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public AU ky(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        AS aS = null;
        try {
            aS = (AS)AS.arM.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            aS = (AS)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (aS != null) {
                this.h(aS);
            }
        }
        return this;
    }

    @Override
    @Deprecated
    public boolean aBC() {
        return (this.an & 1) != 0;
    }

    @Override
    @Deprecated
    public long aBD() {
        return this.apU;
    }

    @Deprecated
    public AU ci(long l) {
        this.an |= 1;
        this.apU = l;
        this.onChanged();
        return this;
    }

    @Deprecated
    public AU aFv() {
        this.an &= 0xFFFFFFFE;
        this.apU = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Yd() {
        return (this.an & 2) != 0;
    }

    @Override
    public af_0 aFc() {
        if (this.arN == null) {
            return this.arE == null ? af_0.aEj() : this.arE;
        }
        return (af_0)this.arN.getMessage();
    }

    public AU d(af_0 af_02) {
        if (this.arN == null) {
            if (af_02 == null) {
                throw new NullPointerException();
            }
            this.arE = af_02;
            this.onChanged();
        } else {
            this.arN.setMessage((AbstractMessage)af_02);
        }
        this.an |= 2;
        return this;
    }

    public AU a(AH aH) {
        if (this.arN == null) {
            this.arE = aH.aEo();
            this.onChanged();
        } else {
            this.arN.setMessage((AbstractMessage)aH.aEo());
        }
        this.an |= 2;
        return this;
    }

    public AU e(af_0 af_02) {
        if (this.arN == null) {
            this.arE = (this.an & 2) != 0 && this.arE != null && this.arE != af_0.aEj() ? af_0.a(this.arE).c(af_02).aEp() : af_02;
            this.onChanged();
        } else {
            this.arN.mergeFrom((AbstractMessage)af_02);
        }
        this.an |= 2;
        return this;
    }

    public AU aFw() {
        if (this.arN == null) {
            this.arE = null;
            this.onChanged();
        } else {
            this.arN.clear();
        }
        this.an &= 0xFFFFFFFD;
        return this;
    }

    public AH aFx() {
        this.an |= 2;
        this.onChanged();
        return (AH)this.aFy().getBuilder();
    }

    @Override
    public AI aFd() {
        if (this.arN != null) {
            return (AI)this.arN.getMessageOrBuilder();
        }
        return this.arE == null ? af_0.aEj() : this.arE;
    }

    private SingleFieldBuilderV3<af_0, AH, AI> aFy() {
        if (this.arN == null) {
            this.arN = new SingleFieldBuilderV3((AbstractMessage)this.aFc(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.arE = null;
        }
        return this.arN;
    }

    private void aFz() {
        if ((this.an & 4) == 0) {
            this.arG = new ArrayList<aj_0>(this.arG);
            this.an |= 4;
        }
    }

    @Override
    public List<aj_0> aFe() {
        if (this.arO == null) {
            return Collections.unmodifiableList(this.arG);
        }
        return this.arO.getMessageList();
    }

    @Override
    public int aFg() {
        if (this.arO == null) {
            return this.arG.size();
        }
        return this.arO.getCount();
    }

    @Override
    public aj_0 lx(int n) {
        if (this.arO == null) {
            return this.arG.get(n);
        }
        return (aj_0)this.arO.getMessage(n);
    }

    public AU a(int n, aj_0 aj_02) {
        if (this.arO == null) {
            if (aj_02 == null) {
                throw new NullPointerException();
            }
            this.aFz();
            this.arG.set(n, aj_02);
            this.onChanged();
        } else {
            this.arO.setMessage(n, (AbstractMessage)aj_02);
        }
        return this;
    }

    public AU a(int n, AL aL) {
        if (this.arO == null) {
            this.aFz();
            this.arG.set(n, aL.aEF());
            this.onChanged();
        } else {
            this.arO.setMessage(n, (AbstractMessage)aL.aEF());
        }
        return this;
    }

    public AU d(aj_0 aj_02) {
        if (this.arO == null) {
            if (aj_02 == null) {
                throw new NullPointerException();
            }
            this.aFz();
            this.arG.add(aj_02);
            this.onChanged();
        } else {
            this.arO.addMessage((AbstractMessage)aj_02);
        }
        return this;
    }

    public AU b(int n, aj_0 aj_02) {
        if (this.arO == null) {
            if (aj_02 == null) {
                throw new NullPointerException();
            }
            this.aFz();
            this.arG.add(n, aj_02);
            this.onChanged();
        } else {
            this.arO.addMessage(n, (AbstractMessage)aj_02);
        }
        return this;
    }

    public AU a(AL aL) {
        if (this.arO == null) {
            this.aFz();
            this.arG.add(aL.aEF());
            this.onChanged();
        } else {
            this.arO.addMessage((AbstractMessage)aL.aEF());
        }
        return this;
    }

    public AU b(int n, AL aL) {
        if (this.arO == null) {
            this.aFz();
            this.arG.add(n, aL.aEF());
            this.onChanged();
        } else {
            this.arO.addMessage(n, (AbstractMessage)aL.aEF());
        }
        return this;
    }

    public AU aE(Iterable<? extends aj_0> iterable) {
        if (this.arO == null) {
            this.aFz();
            AbstractMessageLite.Builder.addAll(iterable, this.arG);
            this.onChanged();
        } else {
            this.arO.addAllMessages(iterable);
        }
        return this;
    }

    public AU aFA() {
        if (this.arO == null) {
            this.arG = Collections.emptyList();
            this.an &= 0xFFFFFFFB;
            this.onChanged();
        } else {
            this.arO.clear();
        }
        return this;
    }

    public AU lB(int n) {
        if (this.arO == null) {
            this.aFz();
            this.arG.remove(n);
            this.onChanged();
        } else {
            this.arO.remove(n);
        }
        return this;
    }

    public AL lC(int n) {
        return (AL)this.aFD().getBuilder(n);
    }

    @Override
    public AM ly(int n) {
        if (this.arO == null) {
            return this.arG.get(n);
        }
        return (AM)this.arO.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends AM> aFf() {
        if (this.arO != null) {
            return this.arO.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.arG);
    }

    public AL aFB() {
        return (AL)this.aFD().addBuilder((AbstractMessage)aj_0.aEA());
    }

    public AL lD(int n) {
        return (AL)this.aFD().addBuilder(n, (AbstractMessage)aj_0.aEA());
    }

    public List<AL> aFC() {
        return this.aFD().getBuilderList();
    }

    private RepeatedFieldBuilderV3<aj_0, AL, AM> aFD() {
        if (this.arO == null) {
            this.arO = new RepeatedFieldBuilderV3(this.arG, (this.an & 4) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.arG = null;
        }
        return this.arO;
    }

    @Override
    public boolean KT() {
        return (this.an & 8) != 0;
    }

    @Override
    public long KU() {
        return this.wf;
    }

    public AU cj(long l) {
        this.an |= 8;
        this.wf = l;
        this.onChanged();
        return this;
    }

    public AU aFE() {
        this.an &= 0xFFFFFFF7;
        this.wf = 0L;
        this.onChanged();
        return this;
    }

    private void aFF() {
        if ((this.an & 0x10) == 0) {
            this.arJ = new ArrayList<Ab>(this.arJ);
            this.an |= 0x10;
        }
    }

    @Override
    public List<Ab> aFh() {
        if (this.arP == null) {
            return Collections.unmodifiableList(this.arJ);
        }
        return this.arP.getMessageList();
    }

    @Override
    public int aFj() {
        if (this.arP == null) {
            return this.arJ.size();
        }
        return this.arP.getCount();
    }

    @Override
    public Ab lz(int n) {
        if (this.arP == null) {
            return this.arJ.get(n);
        }
        return (Ab)this.arP.getMessage(n);
    }

    public AU a(int n, Ab ab) {
        if (this.arP == null) {
            if (ab == null) {
                throw new NullPointerException();
            }
            this.aFF();
            this.arJ.set(n, ab);
            this.onChanged();
        } else {
            this.arP.setMessage(n, (AbstractMessage)ab);
        }
        return this;
    }

    public AU a(int n, Ad ad) {
        if (this.arP == null) {
            this.aFF();
            this.arJ.set(n, ad.aBR());
            this.onChanged();
        } else {
            this.arP.setMessage(n, (AbstractMessage)ad.aBR());
        }
        return this;
    }

    public AU f(Ab ab) {
        if (this.arP == null) {
            if (ab == null) {
                throw new NullPointerException();
            }
            this.aFF();
            this.arJ.add(ab);
            this.onChanged();
        } else {
            this.arP.addMessage((AbstractMessage)ab);
        }
        return this;
    }

    public AU b(int n, Ab ab) {
        if (this.arP == null) {
            if (ab == null) {
                throw new NullPointerException();
            }
            this.aFF();
            this.arJ.add(n, ab);
            this.onChanged();
        } else {
            this.arP.addMessage(n, (AbstractMessage)ab);
        }
        return this;
    }

    public AU b(Ad ad) {
        if (this.arP == null) {
            this.aFF();
            this.arJ.add(ad.aBR());
            this.onChanged();
        } else {
            this.arP.addMessage((AbstractMessage)ad.aBR());
        }
        return this;
    }

    public AU b(int n, Ad ad) {
        if (this.arP == null) {
            this.aFF();
            this.arJ.add(n, ad.aBR());
            this.onChanged();
        } else {
            this.arP.addMessage(n, (AbstractMessage)ad.aBR());
        }
        return this;
    }

    public AU aF(Iterable<? extends Ab> iterable) {
        if (this.arP == null) {
            this.aFF();
            AbstractMessageLite.Builder.addAll(iterable, this.arJ);
            this.onChanged();
        } else {
            this.arP.addAllMessages(iterable);
        }
        return this;
    }

    public AU aFG() {
        if (this.arP == null) {
            this.arJ = Collections.emptyList();
            this.an &= 0xFFFFFFEF;
            this.onChanged();
        } else {
            this.arP.clear();
        }
        return this;
    }

    public AU lE(int n) {
        if (this.arP == null) {
            this.aFF();
            this.arJ.remove(n);
            this.onChanged();
        } else {
            this.arP.remove(n);
        }
        return this;
    }

    public Ad lF(int n) {
        return (Ad)this.aFJ().getBuilder(n);
    }

    @Override
    public Ae lA(int n) {
        if (this.arP == null) {
            return this.arJ.get(n);
        }
        return (Ae)this.arP.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends Ae> aFi() {
        if (this.arP != null) {
            return this.arP.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.arJ);
    }

    public Ad aFH() {
        return (Ad)this.aFJ().addBuilder((AbstractMessage)Ab.aBM());
    }

    public Ad lG(int n) {
        return (Ad)this.aFJ().addBuilder(n, (AbstractMessage)Ab.aBM());
    }

    public List<Ad> aFI() {
        return this.aFJ().getBuilderList();
    }

    private RepeatedFieldBuilderV3<Ab, Ad, Ae> aFJ() {
        if (this.arP == null) {
            this.arP = new RepeatedFieldBuilderV3(this.arJ, (this.an & 0x10) != 0, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.arJ = null;
        }
        return this.arP;
    }

    @Override
    public boolean aBG() {
        return (this.an & 0x20) != 0;
    }

    @Override
    public String aBH() {
        Object object = this.aqa;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.aqa = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString aBI() {
        Object object = this.aqa;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.aqa = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public AU ao(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.an |= 0x20;
        this.aqa = string;
        this.onChanged();
        return this;
    }

    public AU aFK() {
        this.an &= 0xFFFFFFDF;
        this.aqa = AS.aFn().aBH();
        this.onChanged();
        return this;
    }

    public AU ev(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.an |= 0x20;
        this.aqa = byteString;
        this.onChanged();
        return this;
    }

    public final AU gG(UnknownFieldSet unknownFieldSet) {
        return (AU)super.setUnknownFields(unknownFieldSet);
    }

    public final AU gH(UnknownFieldSet unknownFieldSet) {
        return (AU)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gH(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gG(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gH(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cQ(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cQ(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cQ(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gG(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.aFr();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.aFu();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gH(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ky(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cQ(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.aFr();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cQ(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.aFu();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gH(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.gG(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gH(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cQ(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cQ(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cQ(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.gG(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ky(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.aFu();
    }

    public /* synthetic */ Message buildPartial() {
        return this.aFt();
    }

    public /* synthetic */ Message build() {
        return this.aFs();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cQ(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.aFr();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ky(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.aFu();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.aFt();
    }

    public /* synthetic */ MessageLite build() {
        return this.aFs();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.aFr();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aFo();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aFo();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ky(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.aFu();
    }

    public /* synthetic */ Object clone() {
        return this.aFu();
    }
}

