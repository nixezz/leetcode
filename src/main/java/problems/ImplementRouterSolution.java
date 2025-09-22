package problems;

import java.util.*;

public class ImplementRouterSolution {
    static class Router {
        private int MaxLimit;
        Map<String, int[]> map = new HashMap<>();
        Map<Integer, List<Integer>> dest_time = new HashMap<>();
        Queue<String> myQueue = new LinkedList<>();

        public Router(int memoryLimit) {
            MaxLimit = memoryLimit;
        }

        public boolean addPacket(int source, int destination, int timestamp) {
            String key = String.valueOf(source) + "_" + String.valueOf(destination) + "_" + String.valueOf(timestamp);
            if (map.containsKey(key))
                return false;
            if (myQueue.size() >= MaxLimit) {
                forwardPacket();
            }
            myQueue.offer(key);
            map.put(key, new int[] { source, destination, timestamp });
            dest_time.computeIfAbsent(destination, k -> new ArrayList<>()).add(timestamp);
            return true;
        }

        public int[] forwardPacket() {
            if (myQueue.isEmpty()) {
                return new int[] {};
            }

            String key = myQueue.poll();
            int[] result = map.get(key);

            List<Integer> list = dest_time.get(result[1]);
            if (list != null && !list.isEmpty()) {
                list.remove(0);
                if (list.isEmpty()) {
                    dest_time.remove(result[1]);
                }
            }
            map.remove(key);

            return result;
        }

        public int getCount(int destination, int startTime, int endTime) {
            List<Integer> list = dest_time.get(destination);
            if (list == null || list.isEmpty())
                return 0;
            return upperBound(list, endTime) - lowerBound(list, startTime);
        }

        private int lowerBound(List<Integer> list, int target) {
            int low = 0, high = list.size();
            while (low < high) {
                int mid = (low + high) / 2;
                if (list.get(mid) < target) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }

        private int upperBound(List<Integer> list, int target) {
            int low = 0, high = list.size();
            while (low < high) {
                int mid = (low + high) / 2;
                if (list.get(mid) <= target) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }
}
