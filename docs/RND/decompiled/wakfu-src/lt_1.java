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
 * Renamed from lT
 */
public final class lt_1
extends GeneratedMessageV3
implements lw_0 {
    private static final long Jq = 0L;
    public static final int Jr = 1;
    List<lx_0> Fr;
    private byte Y = (byte)-1;
    private static final lt_1 Js = new lt_1();
    @Deprecated
    public static final Parser<lt_1> Jt = new lu_0();

    lt_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private lt_1() {
        this.Fr = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new lt_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    lt_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.Fr = new ArrayList<lx_0>();
                            bl |= true;
                        }
                        this.Fr.add((lx_0)codedInputStream.readMessage(lx_0.JL, extensionRegistryLite));
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
                this.Fr = Collections.unmodifiableList(this.Fr);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor aiX() {
        return ls_1.Jm;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ls_1.Jn.ensureFieldAccessorsInitialized(lt_1.class, lv_1.class);
    }

    @Override
    public List<lx_0> abl() {
        return this.Fr;
    }

    @Override
    public List<? extends ma_0> abm() {
        return this.Fr;
    }

    @Override
    public int abn() {
        return this.Fr.size();
    }

    @Override
    public lx_0 hL(int n) {
        return this.Fr.get(n);
    }

    @Override
    public ma_0 hM(int n) {
        return this.Fr.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.abn(); ++i) {
            if (this.hL(i).isInitialized()) continue;
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
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof lt_1)) {
            return super.equals(object);
        }
        lt_1 lt_12 = (lt_1)object;
        if (!this.abl().equals(lt_12.abl())) {
            return false;
        }
        return this.unknownFields.equals((Object)lt_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + lt_1.aiX().hashCode();
        if (this.abn() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.abl().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static lt_1 bV(ByteBuffer byteBuffer) {
        return (lt_1)Jt.parseFrom(byteBuffer);
    }

    public static lt_1 bR(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (lt_1)Jt.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static lt_1 db(ByteString byteString) {
        return (lt_1)Jt.parseFrom(byteString);
    }

    public static lt_1 bR(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (lt_1)Jt.parseFrom(byteString, extensionRegistryLite);
    }

    public static lt_1 bS(byte[] byArray) {
        return (lt_1)Jt.parseFrom(byArray);
    }

    public static lt_1 bR(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (lt_1)Jt.parseFrom(byArray, extensionRegistryLite);
    }

    public static lt_1 eI(InputStream inputStream) {
        return (lt_1)GeneratedMessageV3.parseWithIOException(Jt, (InputStream)inputStream);
    }

    public static lt_1 eI(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lt_1)GeneratedMessageV3.parseWithIOException(Jt, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lt_1 eJ(InputStream inputStream) {
        return (lt_1)GeneratedMessageV3.parseDelimitedWithIOException(Jt, (InputStream)inputStream);
    }

    public static lt_1 eJ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lt_1)GeneratedMessageV3.parseDelimitedWithIOException(Jt, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lt_1 bR(CodedInputStream codedInputStream) {
        return (lt_1)GeneratedMessageV3.parseWithIOException(Jt, (CodedInputStream)codedInputStream);
    }

    public static lt_1 hz(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lt_1)GeneratedMessageV3.parseWithIOException(Jt, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public lv_1 aiY() {
        return lt_1.aiZ();
    }

    public static lv_1 aiZ() {
        return Js.aja();
    }

    public static lv_1 a(lt_1 lt_12) {
        return Js.aja().c(lt_12);
    }

    public lv_1 aja() {
        return this == Js ? new lv_1() : new lv_1().c(this);
    }

    protected lv_1 bR(GeneratedMessageV3.BuilderParent builderParent) {
        lv_1 lv_12 = new lv_1(builderParent);
        return lv_12;
    }

    public static lt_1 ajb() {
        return Js;
    }

    public static Parser<lt_1> z() {
        return Jt;
    }

    public Parser<lt_1> getParserForType() {
        return Jt;
    }

    public lt_1 ajc() {
        return Js;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bR(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aja();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aiY();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aja();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aiY();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ajc();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ajc();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(lt_1 lt_12) {
        return lt_12.unknownFields;
    }
}

