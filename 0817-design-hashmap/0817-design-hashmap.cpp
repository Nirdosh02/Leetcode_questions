
class Linklist {
public:
    int key;
    int val;
    Linklist* next;
    Linklist() : key(-1), val(-1), next(nullptr) {}
    Linklist(int key, int val) : key(key), val(val), next(nullptr) {}
};

class MyHashMap {
private: 
    Linklist* head;

public:
    MyHashMap() {
        head = nullptr;
    }
    
    void put(int key, int value) {
        if (head == nullptr) {
            head = new Linklist(key, value);
            return;
        }
        Linklist* temp = head;
        while (temp != nullptr) {
            if (temp->key == key) {  
                temp->val = value;
                return;  
            }
            if (temp->next == nullptr) break;
            temp = temp->next;
        }
        temp->next = new Linklist(key, value);
    }
    
    int get(int key) {
        Linklist* temp = head;
        while (temp != nullptr) {
            if (temp->key == key) {
                return temp->val;
            }
            temp = temp->next;
        }
        return -1;  
    }
    
    void remove(int key) {
        if (head == nullptr) return;
        if (head->key == key) {
            Linklist* d = head;
            head = head->next;
            delete d;
            return;
        }

        Linklist* temp = head;
        while (temp->next != nullptr) {
            if (temp->next->key == key) {
                Linklist* d = temp->next;
                temp->next = temp->next->next;
                delete d; 
                return;
            }
            temp = temp->next;
        }
    }
};

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap* obj = new MyHashMap();
 * obj->put(key,value);
 * int param_2 = obj->get(key);
 * obj->remove(key);
 */