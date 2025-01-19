void main() {
//      PRIORITY QUEUE
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->b-a){
            {
                add(20);
                add(88);
            }
        };
        queue.add(10);
        queue.add(5);
        queue.add(15);
//      Queue offer return boolean
        System.out.println(queue.offer(5));
        System.out.println(queue.contains(5));
        System.out.println(queue);
        System.out.println(queue.poll());
        queue.clear();
        System.out.println(queue);


    }

