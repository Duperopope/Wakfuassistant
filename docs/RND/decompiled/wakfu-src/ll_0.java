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
 * Renamed from ll
 */
public final class ll_0
extends GeneratedMessageV3
implements lo_0 {
    private static final long HT = 0L;
    public static final int HU = 1;
    List<li> jj;
    private byte Y = (byte)-1;
    private static final ll_0 HV = new ll_0();
    @Deprecated
    public static final Parser<ll_0> HW = new lm_0();

    ll_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ll_0() {
        this.jj = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ll_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ll_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.jj = new ArrayList<li>();
                            bl |= true;
                        }
                        this.jj.add((li)codedInputStream.readMessage(li.HS, extensionRegistryLite));
                        continue block11;
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
                this.jj = Collections.unmodifiableList(this.jj);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor afP() {
        return kF.Gs;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gt.ensureFieldAccessorsInitialized(ll_0.class, ln_0.class);
    }

    @Override
    public List<li> ot() {
        return this.jj;
    }

    @Override
    public List<? extends lp_0> ou() {
        return this.jj;
    }

    @Override
    public int ov() {
        return this.jj.size();
    }

    @Override
    public li he(int n) {
        return this.jj.get(n);
    }

    @Override
    public lp_0 hf(int n) {
        return this.jj.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.ov(); ++i) {
            if (this.he(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.jj.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.jj.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.jj.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.jj.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ll_0)) {
            return super.equals(object);
        }
        ll_0 ll_02 = (ll_0)object;
        if (!this.ot().equals(ll_02.ot())) {
            return false;
        }
        return this.unknownFields.equals((Object)ll_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ll_0.afP().hashCode();
        if (this.ov() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.ot().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ll_0 bN(ByteBuffer byteBuffer) {
        return (ll_0)HW.parseFrom(byteBuffer);
    }

    public static ll_0 bJ(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ll_0)HW.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ll_0 cS(ByteString byteString) {
        return (ll_0)HW.parseFrom(byteString);
    }

    public static ll_0 bJ(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ll_0)HW.parseFrom(byteString, extensionRegistryLite);
    }

    public static ll_0 bK(byte[] byArray) {
        return (ll_0)HW.parseFrom(byArray);
    }

    public static ll_0 bJ(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ll_0)HW.parseFrom(byArray, extensionRegistryLite);
    }

    public static ll_0 es(InputStream inputStream) {
        return (ll_0)GeneratedMessageV3.parseWithIOException(HW, (InputStream)inputStream);
    }

    public static ll_0 es(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ll_0)GeneratedMessageV3.parseWithIOException(HW, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ll_0 et(InputStream inputStream) {
        return (ll_0)GeneratedMessageV3.parseDelimitedWithIOException(HW, (InputStream)inputStream);
    }

    public static ll_0 et(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ll_0)GeneratedMessageV3.parseDelimitedWithIOException(HW, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ll_0 bJ(CodedInputStream codedInputStream) {
        return (ll_0)GeneratedMessageV3.parseWithIOException(HW, (CodedInputStream)codedInputStream);
    }

    public static ll_0 hb(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ll_0)GeneratedMessageV3.parseWithIOException(HW, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ln_0 afQ() {
        return ll_0.afR();
    }

    public static ln_0 afR() {
        return HV.afS();
    }

    public static ln_0 a(ll_0 ll_02) {
        return HV.afS().c(ll_02);
    }

    public ln_0 afS() {
        return this == HV ? new ln_0() : new ln_0().c(this);
    }

    protected ln_0 bJ(GeneratedMessageV3.BuilderParent builderParent) {
        ln_0 ln_02 = new ln_0(builderParent);
        return ln_02;
    }

    public static ll_0 afT() {
        return HV;
    }

    public static Parser<ll_0> z() {
        return HW;
    }

    public Parser<ll_0> getParserForType() {
        return HW;
    }

    public ll_0 afU() {
        return HV;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bJ(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.afS();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.afQ();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.afS();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.afQ();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.afU();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.afU();
    }

    static /* synthetic */ boolean mZ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean afV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ll_0 ll_02) {
        return ll_02.unknownFields;
    }
}

