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
 *  com.google.protobuf.LazyStringArrayList
 *  com.google.protobuf.LazyStringList
 *  com.google.protobuf.MapEntry
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.ProtocolStringList
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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/*
 * Renamed from aZ
 */
public final class az_2
extends GeneratedMessageV3
implements bd_1 {
    private static final long gi = 0L;
    public static final int gj = 1;
    int gk;
    public static final int gl = 2;
    LazyStringList gm;
    public static final int gn = 3;
    MapField<String, String> go;
    private byte Y = (byte)-1;
    private static final az_2 gp = new az_2();
    static final Parser<az_2> gq = new ba_2();

    az_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private az_2() {
        this.gm = LazyStringArrayList.EMPTY;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new az_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    az_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block13;
                    }
                    case 8: {
                        this.gk = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 18: {
                        String string = codedInputStream.readStringRequireUtf8();
                        if ((n & 1) == 0) {
                            this.gm = new LazyStringArrayList();
                            n |= 1;
                        }
                        this.gm.add((Object)string);
                        continue block13;
                    }
                    case 26: {
                        if ((n & 2) == 0) {
                            this.go = MapField.newMapField(bc_1.gr);
                            n |= 2;
                        }
                        String string = (MapEntry)codedInputStream.readMessage(bc_1.gr.getParserForType(), extensionRegistryLite);
                        this.go.getMutableMap().put((String)string.getKey(), (String)string.getValue());
                        continue block13;
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
                this.gm = this.gm.getUnmodifiableView();
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor hb() {
        return ae_1.fq;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 3: {
                return this.hf();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fr.ensureFieldAccessorsInitialized(az_2.class, bb_1.class);
    }

    @Override
    public int hc() {
        return this.gk;
    }

    public ProtocolStringList hd() {
        return this.gm;
    }

    @Override
    public int he() {
        return this.gm.size();
    }

    @Override
    public String D(int n) {
        return (String)this.gm.get(n);
    }

    @Override
    public ByteString E(int n) {
        return this.gm.getByteString(n);
    }

    MapField<String, String> hf() {
        if (this.go == null) {
            return MapField.emptyMapField(bc_1.gr);
        }
        return this.go;
    }

    @Override
    public int hg() {
        return this.hf().getMap().size();
    }

    @Override
    public boolean n(String string) {
        if (string == null) {
            throw new NullPointerException("map key");
        }
        return this.hf().getMap().containsKey(string);
    }

    @Override
    @Deprecated
    public Map<String, String> hh() {
        return this.hi();
    }

    @Override
    public Map<String, String> hi() {
        return this.hf().getMap();
    }

    @Override
    public String a(String string, String string2) {
        if (string == null) {
            throw new NullPointerException("map key");
        }
        Map map = this.hf().getMap();
        return map.containsKey(string) ? (String)map.get(string) : string2;
    }

    @Override
    public String o(String string) {
        if (string == null) {
            throw new NullPointerException("map key");
        }
        Map map = this.hf().getMap();
        if (!map.containsKey(string)) {
            throw new IllegalArgumentException();
        }
        return (String)map.get(string);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.gk != 0) {
            codedOutputStream.writeInt32(1, this.gk);
        }
        for (int i = 0; i < this.gm.size(); ++i) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.gm.getRaw(i));
        }
        GeneratedMessageV3.serializeStringMapTo((CodedOutputStream)codedOutputStream, this.hf(), bc_1.gr, (int)3);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.gk != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.gk);
        }
        int n2 = 0;
        for (int i = 0; i < this.gm.size(); ++i) {
            n2 += az_2.computeStringSizeNoTag((Object)this.gm.getRaw(i));
        }
        n += n2;
        n += 1 * this.hd().size();
        for (Map.Entry entry : this.hf().getMap().entrySet()) {
            MapEntry mapEntry = bc_1.gr.newBuilderForType().setKey((Object)((String)entry.getKey())).setValue((Object)((String)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof az_2)) {
            return super.equals(object);
        }
        az_2 az_22 = (az_2)object;
        if (this.hc() != az_22.hc()) {
            return false;
        }
        if (!this.hd().equals((Object)az_22.hd())) {
            return false;
        }
        if (!this.hf().equals(az_22.hf())) {
            return false;
        }
        return this.unknownFields.equals((Object)az_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + az_2.hb().hashCode();
        n = 37 * n + 1;
        n = 53 * n + this.hc();
        if (this.he() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.hd().hashCode();
        }
        if (!this.hf().getMap().isEmpty()) {
            n = 37 * n + 3;
            n = 53 * n + this.hf().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static az_2 v(ByteBuffer byteBuffer) {
        return (az_2)gq.parseFrom(byteBuffer);
    }

    public static az_2 v(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (az_2)gq.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static az_2 R(ByteString byteString) {
        return (az_2)gq.parseFrom(byteString);
    }

    public static az_2 v(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (az_2)gq.parseFrom(byteString, extensionRegistryLite);
    }

    public static az_2 v(byte[] byArray) {
        return (az_2)gq.parseFrom(byArray);
    }

    public static az_2 v(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (az_2)gq.parseFrom(byArray, extensionRegistryLite);
    }

    public static az_2 Q(InputStream inputStream) {
        return (az_2)GeneratedMessageV3.parseWithIOException(gq, (InputStream)inputStream);
    }

    public static az_2 Q(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (az_2)GeneratedMessageV3.parseWithIOException(gq, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static az_2 R(InputStream inputStream) {
        return (az_2)GeneratedMessageV3.parseDelimitedWithIOException(gq, (InputStream)inputStream);
    }

    public static az_2 R(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (az_2)GeneratedMessageV3.parseDelimitedWithIOException(gq, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static az_2 v(CodedInputStream codedInputStream) {
        return (az_2)GeneratedMessageV3.parseWithIOException(gq, (CodedInputStream)codedInputStream);
    }

    public static az_2 al(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (az_2)GeneratedMessageV3.parseWithIOException(gq, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bb_1 hj() {
        return az_2.hk();
    }

    public static bb_1 hk() {
        return gp.hl();
    }

    public static bb_1 a(az_2 az_22) {
        return gp.hl().c(az_22);
    }

    public bb_1 hl() {
        return this == gp ? new bb_1() : new bb_1().c(this);
    }

    protected bb_1 v(GeneratedMessageV3.BuilderParent builderParent) {
        bb_1 bb_12 = new bb_1(builderParent);
        return bb_12;
    }

    public static az_2 hm() {
        return gp;
    }

    public static Parser<az_2> z() {
        return gq;
    }

    public Parser<az_2> getParserForType() {
        return gq;
    }

    public az_2 hn() {
        return gp;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.v(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.hl();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.hj();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.hl();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.hj();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.hn();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.hn();
    }

    public /* synthetic */ List ho() {
        return this.hd();
    }

    static /* synthetic */ boolean hp() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(az_2 az_22) {
        return az_22.unknownFields;
    }

    static /* synthetic */ void S(ByteString byteString) {
        az_2.checkByteStringIsUtf8((ByteString)byteString);
    }
}

