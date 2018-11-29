/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals == null || intervals.size() <= 1)
        {
            return intervals;
        }
        
        // Collections.sort(intervals, (a, b) -> a.start - b.start);
        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval a, Interval b)
            {
                return a.start - b.start;
            }
        });
        
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        List<Interval> result = new ArrayList<>();
        
        for(Interval interval : intervals)
        {
            if(interval.start <= end)
            {
                end = Math.max(end, interval.end);
            }
            else{
                result.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        result.add(new Interval(start, end));
        return result;
    }
}