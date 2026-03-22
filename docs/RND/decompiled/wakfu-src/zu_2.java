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
 *  com.google.protobuf.Internal$IntList
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from zu
 */
public final class zu_2
extends GeneratedMessageV3
implements zx_2 {
    private static final long aod = 0L;
    int an;
    public static final int aoe = 1;
    int aof;
    public static final int aog = 2;
    List<zq_2> aoh;
    public static final int aoi = 3;
    Internal.IntList aoj;
    public static final int aok = 4;
    boolean aol;
    private byte Y = (byte)-1;
    private static final zu_2 aom = new zu_2();
    @Deprecated
    public static final Parser<zu_2> aon = new zv_2();

    zu_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private zu_2() {
        this.aoh = Collections.emptyList();
        this.aoj = zu_2.emptyIntList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new zu_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    zu_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 8: {
                        this.an |= 1;
                        this.aof = codedInputStream.readInt32();
                        continue block15;
                    }
                    case 18: {
                        if ((n & 2) == 0) {
                            this.aoh = new ArrayList<zq_2>();
                            n |= 2;
                        }
                        this.aoh.add((zq_2)codedInputStream.readMessage(zq_2.aoa, extensionRegistryLite));
                        continue block15;
                    }
                    case 24: {
                        if ((n & 4) == 0) {
                            this.aoj = zu_2.newIntList();
                            n |= 4;
                        }
                        this.aoj.addInt(codedInputStream.readInt32());
                        continue block15;
                    }
                    case 26: {
                        int n3 = codedInputStream.readRawVarint32();
                        int n4 = codedInputStream.pushLimit(n3);
                        if ((n & 4) == 0 && codedInputStream.getBytesUntilLimit() > 0) {
                            this.aoj = zu_2.newIntList();
                            n |= 4;
                        }
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.aoj.addInt(codedInputStream.readInt32());
                        }
                        codedInputStream.popLimit(n4);
                        continue block15;
                    }
                    case 32: {
                        this.an |= 2;
                        this.aol = codedInputStream.readBool();
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
            if ((n & 2) != 0) {
                this.aoh = Collections.unmodifiableList(this.aoh);
            }
            if ((n & 4) != 0) {
                this.aoj.makeImmutable();
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor ayO() {
        return zp_2.anK;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zp_2.anL.ensureFieldAccessorsInitialized(zu_2.class, zw_2.class);
    }

    @Override
    public boolean ayP() {
        return (this.an & 1) != 0;
    }

    @Override
    public int ayQ() {
        return this.aof;
    }

    @Override
    public List<zq_2> ayR() {
        return this.aoh;
    }

    @Override
    public List<? extends zt_2> ayS() {
        return this.aoh;
    }

    @Override
    public int ayT() {
        return this.aoh.size();
    }

    @Override
    public zq_2 kG(int n) {
        return this.aoh.get(n);
    }

    @Override
    public zt_2 kH(int n) {
        return this.aoh.get(n);
    }

    @Override
    public List<Integer> ayU() {
        return this.aoj;
    }

    @Override
    public int ayV() {
        return this.aoj.size();
    }

    @Override
    public int kI(int n) {
        return this.aoj.getInt(n);
    }

    @Override
    public boolean ayW() {
        return (this.an & 2) != 0;
    }

    @Override
    public boolean ayX() {
        return this.aol;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.ayP()) {
            this.Y = 0;
            return false;
        }
        if (!this.ayW()) {
            this.Y = 0;
            return false;
        }
        for (int i = 0; i < this.ayT(); ++i) {
            if (this.kG(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.aof);
        }
        for (n = 0; n < this.aoh.size(); ++n) {
            codedOutputStream.writeMessage(2, (MessageLite)this.aoh.get(n));
        }
        for (n = 0; n < this.aoj.size(); ++n) {
            codedOutputStream.writeInt32(3, this.aoj.getInt(n));
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeBool(4, this.aol);
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
            n2 += CodedOutputStream.computeInt32Size((int)1, (int)this.aof);
        }
        for (n = 0; n < this.aoh.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.aoh.get(n)));
        }
        n = 0;
        for (int i = 0; i < this.aoj.size(); ++i) {
            n += CodedOutputStream.computeInt32SizeNoTag((int)this.aoj.getInt(i));
        }
        n2 += n;
        n2 += 1 * this.ayU().size();
        if ((this.an & 2) != 0) {
            n2 += CodedOutputStream.computeBoolSize((int)4, (boolean)this.aol);
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof zu_2)) {
            return super.equals(object);
        }
        zu_2 zu_22 = (zu_2)object;
        if (this.ayP() != zu_22.ayP()) {
            return false;
        }
        if (this.ayP() && this.ayQ() != zu_22.ayQ()) {
            return false;
        }
        if (!this.ayR().equals(zu_22.ayR())) {
            return false;
        }
        if (!this.ayU().equals(zu_22.ayU())) {
            return false;
        }
        if (this.ayW() != zu_22.ayW()) {
            return false;
        }
        if (this.ayW() && this.ayX() != zu_22.ayX()) {
            return false;
        }
        return this.unknownFields.equals((Object)zu_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + zu_2.ayO().hashCode();
        if (this.ayP()) {
            n = 37 * n + 1;
            n = 53 * n + this.ayQ();
        }
        if (this.ayT() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.ayR().hashCode();
        }
        if (this.ayV() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.ayU().hashCode();
        }
        if (this.ayW()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashBoolean((boolean)this.ayX());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static zu_2 el(ByteBuffer byteBuffer) {
        return (zu_2)aon.parseFrom(byteBuffer);
    }

    public static zu_2 cz(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (zu_2)aon.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static zu_2 ea(ByteString byteString) {
        return (zu_2)aon.parseFrom(byteString);
    }

    public static zu_2 cz(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (zu_2)aon.parseFrom(byteString, extensionRegistryLite);
    }

    public static zu_2 cB(byte[] byArray) {
        return (zu_2)aon.parseFrom(byArray);
    }

    public static zu_2 cz(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (zu_2)aon.parseFrom(byArray, extensionRegistryLite);
    }

    public static zu_2 fY(InputStream inputStream) {
        return (zu_2)GeneratedMessageV3.parseWithIOException(aon, (InputStream)inputStream);
    }

    public static zu_2 fY(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zu_2)GeneratedMessageV3.parseWithIOException(aon, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zu_2 fZ(InputStream inputStream) {
        return (zu_2)GeneratedMessageV3.parseDelimitedWithIOException(aon, (InputStream)inputStream);
    }

    public static zu_2 fZ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zu_2)GeneratedMessageV3.parseDelimitedWithIOException(aon, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zu_2 cz(CodedInputStream codedInputStream) {
        return (zu_2)GeneratedMessageV3.parseWithIOException(aon, (CodedInputStream)codedInputStream);
    }

    public static zu_2 jx(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zu_2)GeneratedMessageV3.parseWithIOException(aon, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public zw_2 ayY() {
        return zu_2.ayZ();
    }

    public static zw_2 ayZ() {
        return aom.aza();
    }

    public static zw_2 a(zu_2 zu_22) {
        return aom.aza().c(zu_22);
    }

    public zw_2 aza() {
        return this == aom ? new zw_2() : new zw_2().c(this);
    }

    protected zw_2 cz(GeneratedMessageV3.BuilderParent builderParent) {
        zw_2 zw_22 = new zw_2(builderParent);
        return zw_22;
    }

    public static zu_2 azb() {
        return aom;
    }

    public static Parser<zu_2> z() {
        return aon;
    }

    public Parser<zu_2> getParserForType() {
        return aon;
    }

    public zu_2 azc() {
        return aom;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.cz(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aza();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.ayY();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aza();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.ayY();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.azc();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.azc();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ Internal.IntList auN() {
        return zu_2.emptyIntList();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(zu_2 zu_22) {
        return zu_22.unknownFields;
    }

    static /* synthetic */ Internal.IntList amY() {
        return zu_2.emptyIntList();
    }

    static /* synthetic */ Internal.IntList e(Internal.IntList intList) {
        return zu_2.mutableCopy((Internal.IntList)intList);
    }

    static /* synthetic */ Internal.IntList Ac() {
        return zu_2.emptyIntList();
    }
}

