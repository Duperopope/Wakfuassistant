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
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.LazyStringArrayList
 *  com.google.protobuf.LazyStringList
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.ProtocolStringList
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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/*
 * Renamed from bb
 */
public final class bb_1
extends GeneratedMessageV3.Builder<bb_1>
implements bd_1 {
    private int an;
    private int gk;
    private LazyStringList gm = LazyStringArrayList.EMPTY;
    private MapField<String, String> go;

    public static final Descriptors.Descriptor hq() {
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

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 3: {
                return this.hy();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fr.ensureFieldAccessorsInitialized(az_2.class, bb_1.class);
    }

    bb_1() {
        this.D();
    }

    bb_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (az_2.hp()) {
            // empty if block
        }
    }

    public bb_1 hr() {
        super.clear();
        this.gk = 0;
        this.gm = LazyStringArrayList.EMPTY;
        this.an &= 0xFFFFFFFE;
        this.hy().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ae_1.fq;
    }

    public az_2 hn() {
        return az_2.hm();
    }

    public az_2 hs() {
        az_2 az_22 = this.ht();
        if (!az_22.isInitialized()) {
            throw bb_1.newUninitializedMessageException((Message)az_22);
        }
        return az_22;
    }

    public az_2 ht() {
        az_2 az_22 = new az_2(this);
        int n = this.an;
        az_22.gk = this.gk;
        if ((this.an & 1) != 0) {
            this.gm = this.gm.getUnmodifiableView();
            this.an &= 0xFFFFFFFE;
        }
        az_22.gm = this.gm;
        az_22.go = this.hf();
        az_22.go.makeImmutable();
        this.onBuilt();
        return az_22;
    }

    public bb_1 hu() {
        return (bb_1)super.clone();
    }

    public bb_1 Q(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bb_1)super.setField(fieldDescriptor, object);
    }

    public bb_1 v(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bb_1)super.clearField(fieldDescriptor);
    }

    public bb_1 v(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bb_1)super.clearOneof(oneofDescriptor);
    }

    public bb_1 v(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bb_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bb_1 R(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bb_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public bb_1 v(Message message) {
        if (message instanceof az_2) {
            return this.c((az_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bb_1 c(az_2 az_22) {
        if (az_22 == az_2.hm()) {
            return this;
        }
        if (az_22.hc() != 0) {
            this.F(az_22.hc());
        }
        if (!az_22.gm.isEmpty()) {
            if (this.gm.isEmpty()) {
                this.gm = az_22.gm;
                this.an &= 0xFFFFFFFE;
            } else {
                this.hw();
                this.gm.addAll((Collection)az_22.gm);
            }
            this.onChanged();
        }
        this.hy().mergeFrom(az_22.hf());
        this.R(az_2.b(az_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public bb_1 an(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        az_2 az_22 = null;
        try {
            az_22 = (az_2)az_2.gq.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            az_22 = (az_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (az_22 != null) {
                this.c(az_22);
            }
        }
        return this;
    }

    @Override
    public int hc() {
        return this.gk;
    }

    public bb_1 F(int n) {
        this.gk = n;
        this.onChanged();
        return this;
    }

    public bb_1 hv() {
        this.gk = 0;
        this.onChanged();
        return this;
    }

    private void hw() {
        if ((this.an & 1) == 0) {
            this.gm = new LazyStringArrayList(this.gm);
            this.an |= 1;
        }
    }

    public ProtocolStringList hd() {
        return this.gm.getUnmodifiableView();
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

    public bb_1 a(int n, String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.hw();
        this.gm.set(n, (Object)string);
        this.onChanged();
        return this;
    }

    public bb_1 p(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.hw();
        this.gm.add((Object)string);
        this.onChanged();
        return this;
    }

    public bb_1 c(Iterable<String> iterable) {
        this.hw();
        AbstractMessageLite.Builder.addAll(iterable, (List)this.gm);
        this.onChanged();
        return this;
    }

    public bb_1 hx() {
        this.gm = LazyStringArrayList.EMPTY;
        this.an &= 0xFFFFFFFE;
        this.onChanged();
        return this;
    }

    public bb_1 T(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        az_2.S(byteString);
        this.hw();
        this.gm.add(byteString);
        this.onChanged();
        return this;
    }

    private MapField<String, String> hf() {
        if (this.go == null) {
            return MapField.emptyMapField(bc_1.gr);
        }
        return this.go;
    }

    private MapField<String, String> hy() {
        this.onChanged();
        if (this.go == null) {
            this.go = MapField.newMapField(bc_1.gr);
        }
        if (!this.go.isMutable()) {
            this.go = this.go.copy();
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

    public bb_1 hz() {
        this.hy().getMutableMap().clear();
        return this;
    }

    public bb_1 q(String string) {
        if (string == null) {
            throw new NullPointerException("map key");
        }
        this.hy().getMutableMap().remove(string);
        return this;
    }

    @Deprecated
    public Map<String, String> hA() {
        return this.hy().getMutableMap();
    }

    public bb_1 b(String string, String string2) {
        if (string == null) {
            throw new NullPointerException("map key");
        }
        if (string2 == null) {
            throw new NullPointerException("map value");
        }
        this.hy().getMutableMap().put(string, string2);
        return this;
    }

    public bb_1 a(Map<String, String> map) {
        this.hy().getMutableMap().putAll(map);
        return this;
    }

    public final bb_1 Q(UnknownFieldSet unknownFieldSet) {
        return (bb_1)super.setUnknownFields(unknownFieldSet);
    }

    public final bb_1 R(UnknownFieldSet unknownFieldSet) {
        return (bb_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.R(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.Q(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.R(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.v(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.v(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.v(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.Q(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.hr();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.hu();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.R(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.an(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.v(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.hr();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.v(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.hu();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.R(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.Q(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.R(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.v(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.v(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.v(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.Q(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.an(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.hu();
    }

    public /* synthetic */ Message buildPartial() {
        return this.ht();
    }

    public /* synthetic */ Message build() {
        return this.hs();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.v(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.hr();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.an(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.hu();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.ht();
    }

    public /* synthetic */ MessageLite build() {
        return this.hs();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.hr();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.hn();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.hn();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.an(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.hu();
    }

    public /* synthetic */ Object clone() {
        return this.hu();
    }

    public /* synthetic */ List ho() {
        return this.hd();
    }
}

