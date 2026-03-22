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
 * Renamed from ks
 */
public final class ks_0
extends GeneratedMessageV3
implements kv_0 {
    private static final long Fp = 0L;
    int an;
    public static final int Fq = 1;
    List<kc> Fr;
    public static final int Fs = 2;
    kg_0 Ft;
    private byte Y = (byte)-1;
    private static final ks_0 Fu = new ks_0();
    @Deprecated
    public static final Parser<ks_0> Fv = new kt_0();

    ks_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ks_0() {
        this.Fr = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ks_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ks_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.Fr = new ArrayList<kc>();
                            bl |= true;
                        }
                        this.Fr.add((kc)codedInputStream.readMessage(kc.EM, extensionRegistryLite));
                        continue block12;
                    }
                    case 18: {
                        ki_0 ki_02 = null;
                        if ((this.an & 1) != 0) {
                            ki_02 = this.Ft.aab();
                        }
                        this.Ft = (kg_0)codedInputStream.readMessage(kg_0.ET, extensionRegistryLite);
                        if (ki_02 != null) {
                            ki_02.c(this.Ft);
                            this.Ft = ki_02.aah();
                        }
                        this.an |= 1;
                        continue block12;
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
            if (bl & true) {
                this.Fr = Collections.unmodifiableList(this.Fr);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor abk() {
        return kb.Ev;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kb.Ew.ensureFieldAccessorsInitialized(ks_0.class, ku_0.class);
    }

    @Override
    public List<kc> abl() {
        return this.Fr;
    }

    @Override
    public List<? extends kf_0> abm() {
        return this.Fr;
    }

    @Override
    public int abn() {
        return this.Fr.size();
    }

    @Override
    public kc gB(int n) {
        return this.Fr.get(n);
    }

    @Override
    public kf_0 gC(int n) {
        return this.Fr.get(n);
    }

    @Override
    public boolean abo() {
        return (this.an & 1) != 0;
    }

    @Override
    public kg_0 abp() {
        return this.Ft == null ? kg_0.aac() : this.Ft;
    }

    @Override
    public kr_0 abq() {
        return this.Ft == null ? kg_0.aac() : this.Ft;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.abo()) {
            this.Y = 0;
            return false;
        }
        for (int i = 0; i < this.abn(); ++i) {
            if (this.gB(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        if (!this.abp().isInitialized()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.Fr.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.Fr.get(i));
        }
        if ((this.an & 1) != 0) {
            codedOutputStream.writeMessage(2, (MessageLite)this.abp());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.Fr.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.Fr.get(i)));
        }
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.abp());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ks_0)) {
            return super.equals(object);
        }
        ks_0 ks_02 = (ks_0)object;
        if (!this.abl().equals(ks_02.abl())) {
            return false;
        }
        if (this.abo() != ks_02.abo()) {
            return false;
        }
        if (this.abo() && !this.abp().equals(ks_02.abp())) {
            return false;
        }
        return this.unknownFields.equals((Object)ks_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ks_0.abk().hashCode();
        if (this.abn() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.abl().hashCode();
        }
        if (this.abo()) {
            n = 37 * n + 2;
            n = 53 * n + this.abp().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ks_0 bC(ByteBuffer byteBuffer) {
        return (ks_0)Fv.parseFrom(byteBuffer);
    }

    public static ks_0 by(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ks_0)Fv.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ks_0 cG(ByteString byteString) {
        return (ks_0)Fv.parseFrom(byteString);
    }

    public static ks_0 by(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ks_0)Fv.parseFrom(byteString, extensionRegistryLite);
    }

    public static ks_0 bz(byte[] byArray) {
        return (ks_0)Fv.parseFrom(byArray);
    }

    public static ks_0 by(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ks_0)Fv.parseFrom(byArray, extensionRegistryLite);
    }

    public static ks_0 dW(InputStream inputStream) {
        return (ks_0)GeneratedMessageV3.parseWithIOException(Fv, (InputStream)inputStream);
    }

    public static ks_0 dW(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ks_0)GeneratedMessageV3.parseWithIOException(Fv, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ks_0 dX(InputStream inputStream) {
        return (ks_0)GeneratedMessageV3.parseDelimitedWithIOException(Fv, (InputStream)inputStream);
    }

    public static ks_0 dX(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ks_0)GeneratedMessageV3.parseDelimitedWithIOException(Fv, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ks_0 by(CodedInputStream codedInputStream) {
        return (ks_0)GeneratedMessageV3.parseWithIOException(Fv, (CodedInputStream)codedInputStream);
    }

    public static ks_0 gu(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ks_0)GeneratedMessageV3.parseWithIOException(Fv, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ku_0 abr() {
        return ks_0.abs();
    }

    public static ku_0 abs() {
        return Fu.abt();
    }

    public static ku_0 a(ks_0 ks_02) {
        return Fu.abt().c(ks_02);
    }

    public ku_0 abt() {
        return this == Fu ? new ku_0() : new ku_0().c(this);
    }

    protected ku_0 by(GeneratedMessageV3.BuilderParent builderParent) {
        ku_0 ku_02 = new ku_0(builderParent);
        return ku_02;
    }

    public static ks_0 abu() {
        return Fu;
    }

    public static Parser<ks_0> z() {
        return Fv;
    }

    public Parser<ks_0> getParserForType() {
        return Fv;
    }

    public ks_0 abv() {
        return Fu;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.by(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.abt();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.abr();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.abt();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.abr();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.abv();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.abv();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ks_0 ks_02) {
        return ks_02.unknownFields;
    }
}

