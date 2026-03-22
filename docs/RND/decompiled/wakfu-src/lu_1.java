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
 * Renamed from lu
 */
public final class lu_1
extends GeneratedMessageV3
implements lx_1 {
    private static final long Ie = 0L;
    public static final int If = 1;
    List<kW> jj;
    private byte Y = (byte)-1;
    private static final lu_1 Ig = new lu_1();
    @Deprecated
    public static final Parser<lu_1> Ih = new lv_0();

    lu_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private lu_1() {
        this.jj = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new lu_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    lu_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.jj = new ArrayList<kW>();
                            bl |= true;
                        }
                        this.jj.add((kW)codedInputStream.readMessage(kW.Hs, extensionRegistryLite));
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

    public static final Descriptors.Descriptor agu() {
        return kF.Gg;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kF.Gh.ensureFieldAccessorsInitialized(lu_1.class, lw_1.class);
    }

    @Override
    public List<kW> ot() {
        return this.jj;
    }

    @Override
    public List<? extends lh> ou() {
        return this.jj;
    }

    @Override
    public int ov() {
        return this.jj.size();
    }

    @Override
    public kW dW(int n) {
        return this.jj.get(n);
    }

    @Override
    public lh dX(int n) {
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
            if (this.dW(i).isInitialized()) continue;
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
        if (!(object instanceof lu_1)) {
            return super.equals(object);
        }
        lu_1 lu_12 = (lu_1)object;
        if (!this.ot().equals(lu_12.ot())) {
            return false;
        }
        return this.unknownFields.equals((Object)lu_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + lu_1.agu().hashCode();
        if (this.ov() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.ot().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static lu_1 bP(ByteBuffer byteBuffer) {
        return (lu_1)Ih.parseFrom(byteBuffer);
    }

    public static lu_1 bL(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (lu_1)Ih.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static lu_1 cU(ByteString byteString) {
        return (lu_1)Ih.parseFrom(byteString);
    }

    public static lu_1 bL(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (lu_1)Ih.parseFrom(byteString, extensionRegistryLite);
    }

    public static lu_1 bM(byte[] byArray) {
        return (lu_1)Ih.parseFrom(byArray);
    }

    public static lu_1 bL(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (lu_1)Ih.parseFrom(byArray, extensionRegistryLite);
    }

    public static lu_1 ew(InputStream inputStream) {
        return (lu_1)GeneratedMessageV3.parseWithIOException(Ih, (InputStream)inputStream);
    }

    public static lu_1 ew(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lu_1)GeneratedMessageV3.parseWithIOException(Ih, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lu_1 ex(InputStream inputStream) {
        return (lu_1)GeneratedMessageV3.parseDelimitedWithIOException(Ih, (InputStream)inputStream);
    }

    public static lu_1 ex(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lu_1)GeneratedMessageV3.parseDelimitedWithIOException(Ih, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lu_1 bL(CodedInputStream codedInputStream) {
        return (lu_1)GeneratedMessageV3.parseWithIOException(Ih, (CodedInputStream)codedInputStream);
    }

    public static lu_1 hh(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lu_1)GeneratedMessageV3.parseWithIOException(Ih, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public lw_1 agv() {
        return lu_1.agw();
    }

    public static lw_1 agw() {
        return Ig.agx();
    }

    public static lw_1 c(lu_1 lu_12) {
        return Ig.agx().e(lu_12);
    }

    public lw_1 agx() {
        return this == Ig ? new lw_1() : new lw_1().e(this);
    }

    protected lw_1 bL(GeneratedMessageV3.BuilderParent builderParent) {
        lw_1 lw_12 = new lw_1(builderParent);
        return lw_12;
    }

    public static lu_1 agy() {
        return Ig;
    }

    public static Parser<lu_1> z() {
        return Ih;
    }

    public Parser<lu_1> getParserForType() {
        return Ih;
    }

    public lu_1 agz() {
        return Ig;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bL(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.agx();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.agv();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.agx();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.agv();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.agz();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.agz();
    }

    static /* synthetic */ boolean BA() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean fK() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet d(lu_1 lu_12) {
        return lu_12.unknownFields;
    }
}

