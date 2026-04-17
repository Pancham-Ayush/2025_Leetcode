import re
import matplotlib.pyplot as plt

times = []
heap_used = []

with open("gc.log") as f:
    for line in f:
        # Find time since start
        match_time = re.search(r'\[(\d+\.\d+)s\]', line)
        # Find used heap in the format "Used: X"
        match_heap = re.search(r'Used:\s*(\d+)M', line)
        if match_time and match_heap:
            times.append(float(match_time.group(1)))
            heap_used.append(int(match_heap.group(1)))

plt.plot(times, heap_used, marker='o')
plt.title("JVM Heap Usage over Time (from GC logs)")
plt.xlabel("Time (seconds)")
plt.ylabel("Heap Used (MB)")
plt.grid(True, linestyle="--", alpha=0.6)
plt.show()
